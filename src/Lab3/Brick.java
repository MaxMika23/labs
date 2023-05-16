package Lab3;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Brick {
    private static final Logger logger = Logger.getLogger(Brick.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Введите размеры отверстия (A B):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        logger.info("Введите размеры кирпича (X Y Z):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if ((x <= a && y <= b) || (x <= b && y <= a) ||
                (y <= a && z <= b) || (y <= b && z <= a) ||
                (x <= a && z <= b) || (x <= b && z <= a)) {
            logger.info("Кирпич пройдет через отверстие");
        } else {
            logger.info("Кирпич не пройдет через отверстие");
        }

        scanner.close();
    }
}