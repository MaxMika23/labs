package Lab3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Square {
    private static final Logger logger = LogManager.getLogger(Square.class);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info("Введите трехзначное число: ");
        int number = input.nextInt();

        int sum = 0; // Инициализация переменной sum (сумма цифр числа)
        int currentDigit; // Инициализация переменной currentDigit (текущая цифра числа)
        int originalNumber = number;  // Сохранение исходного числа в переменной originalNumber

        // Цикл while для вычисления суммы цифр числа
        while (number > 0) {
            currentDigit = number % 10; // Получение текущей цифры числа
            sum += currentDigit; // Добавление текущей цифры к сумме
            number /= 10; // Уменьшение числа на один разряд
        }

        // Проверка, что введенное число является трехзначным
        if (originalNumber >= 100 && originalNumber <= 999) {
            int square = originalNumber * originalNumber; // Вычисление квадрата исходного числа
            int cubeOfSum = (int) Math.pow(sum, 3); // Вычисление куба суммы цифр числа

            // Проверка равенства квадрата исходного числа и куба суммы его цифр
            if (square == cubeOfSum) {
                logger.info("Квадрат числа равен кубу суммы его цифр.");
            } else {
                logger.info("Квадрат числа НЕ равен кубу суммы его цифр.");
            }
        } else {
            logger.info("Введенное число не является трехзначным.");
        }
    }
}