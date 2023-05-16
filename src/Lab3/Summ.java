package Lab3;

import org.apache.log4j.Logger;

public class Summ {
    // Создаем объект логгера
    private static final Logger logger = Logger.getLogger(Summ.class);

    public static void main(String[] args) {
        logger.info("Starting program"); // Логируем начало работы программы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Скольки значно должно быть число: ");
        int n = scanner.nextInt();
        logger.debug("n = " + n); // Логируем значение n для отладки
        // Запрашиваем у пользователя сумму цифр, которую должно составлять число
        System.out.print("Скольки должна быть равна сумма чисел: ");
        int k = scanner.nextInt();
        logger.debug("k = " + k); // Логируем значение k для отладки
        scanner.close();

        // Находим числа, которые соответствуют заданным критериям
        findNumbers(n, k);
        logger.info("Program finished"); // Логируем окончание работы программы
    }

    // Метод для поиска чисел, соответствующих заданным критериям
    private static void findNumbers(int n, int k) {
        logger.debug("Finding numbers with n = " + n + ", k = " + k); // Логируем параметры для отладки
        int[] currentNumber = new int[n];
        findNumbersHelper(currentNumber, 0, k); // Вызываем вспомогательный метод
    }

    // Вспомогательный метод для поиска чисел, соответствующих заданным критериям
    private static void findNumbersHelper(int[] currentNumber, int index, int remainingSum) {
        // Если все цифры уже выбраны, проверяем сумму цифр
        if (index == currentNumber.length) {
            if (remainingSum == 0) {
                logger.info("Found number: " + arrayToString(currentNumber)); // Логируем найденное число
            }
            return;
        }

        // Перебираем все возможные цифры от 0 до 9
        for (int i = 0; i <= 9; i++) {
            if (i == 0 && index == 0)
            {
            continue; // Первая цифра не может быть нулем
}
            if (remainingSum - i >= 0) {
                currentNumber[index] = i; // Записываем цифру в текущее число
                findNumbersHelper(currentNumber, index + 1, remainingSum - i); // Рекурсивно вызываем метод для следующей цифры
            }
        }
    }

    // Метод для преобразования массива цифр в строку
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j);
        }
        return sb.toString();
    }
}
