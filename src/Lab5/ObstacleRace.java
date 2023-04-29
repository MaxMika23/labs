package Lab5;

import java.util.Random;

public class ObstacleRace {
    public static final int WIDTH = 5; // Ширина трассы
    public static final int HEIGHT = 10; // Высота трассы
    public static final int NUM_RUNNERS = 3; // Количество бегунов
    public static final int MAX_DELAY = 3000; // Максимальное время задержки на препятствии в миллисекундах

    public static void main(String[] args) {
        // Создаем трассу с произвольным количеством препятствий
        int[][] track = new int[WIDTH][HEIGHT];
        Random random = new Random();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (random.nextBoolean()) {
                    track[i][j] = 1;
                }
            }
        }

        // Создаем бегунов и запускаем их потоки
        Runner[] runners = new Runner[NUM_RUNNERS];
        for (int i = 0; i < NUM_RUNNERS; i++) {
            runners[i] = new Runner(i, track);
            runners[i].start();
        }

        // Создаем поток для вывода результатов
        ResultPrinter resultPrinter = new ResultPrinter(runners);
        resultPrinter.start();
    }
}

class Runner extends Thread {
    private int id; // Номер бегуна
    private int[][] track; // Трасса с препятствиями

    public Runner(int id, int[][] track) {
        this.id = id;
        this.track = track;
    }

    @Override
    public void run() {
        int position = 0; // Начальная позиция бегуна
        while (position < ObstacleRace.HEIGHT) {
            // Проверяем наличие препятствия на текущей позиции
            if (track[id][position] == 1) {
                int delay = new Random().nextInt(ObstacleRace.MAX_DELAY);
                System.out.println("Бегун " + id + " задержался на препятствии на " + delay + " миллисекунд");
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            position++; // Перемещаем бегуна на следующую позицию
        }
        System.out.println("Бегун " + id + " финишировал");
        ResultPrinter.addResult(id); // Добавляем результат в общий список результатов
    }
}

class ResultPrinter extends Thread {
    private static int[] results = new int[ObstacleRace.NUM_RUNNERS]; // Список результатов бегунов
    private static int numFinished = 0; // Количество финишировавших бегунов
    private Runner[] runners; // Список бегунов

    public ResultPrinter(Runner[] runners) {
        this.runners = runners;
    }

    public static synchronized void addResult(int id) {
        results[id] = numFinished + 1; // Номер места - порядковый номер финишировавшего бегуна
        numFinished++;
    }
}