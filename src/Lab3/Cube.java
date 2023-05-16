package Lab3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Cube {
    private static final Logger logger = LogManager.getLogger(Cube.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем длину ребра куба от пользователя
        logger.info("Введите длину ребра куба: ");
        double edgeLength = scanner.nextDouble();

        // Вычисляем площадь грани, площадь поверхности и объем куба
        double faceArea = Math.pow(edgeLength, 2);
        double surfaceArea = 6 * Math.pow(edgeLength, 2);
        double volume = Math.pow(edgeLength, 3);

        // Выводим результаты вычислений на экран
        logger.info("Площадь грани куба равна: " + faceArea);
        logger.info("Площадь поверхности куба равна: " + surfaceArea);
        logger.info("Объем куба равен: " + volume);
    }
}