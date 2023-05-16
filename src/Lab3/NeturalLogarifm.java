package Lab3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class NeturalLogarifm {
    private static final Logger logger = LogManager.getLogger(NeturalLogarifm.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Вывод приглашения для ввода значения x
            System.out.print("Введите x: ");
            // Чтение значения x, введенного пользователем, с помощью метода nextDouble() объекта scanner
            double x = scanner.nextDouble();
            // Вычисление результата выражения, заданного в задаче, и сохранение его в переменную result
            double result = Math.log(Math.abs(Math.cos(x))) / Math.log(1 + Math.pow(x, 2));
            // Вывод результата вычислений на экран
            System.out.println("Ваш результат: " + result);
            logger.info("Выполнено успешное вычисление с x = " + x + ", результат: " + result);
        } catch (Exception e) {
            logger.error("Ошибка при выполнении программы: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}