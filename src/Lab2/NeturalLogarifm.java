package Lab2;

import java.util.Scanner;

public class NeturalLogarifm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // Вывод приглашения для ввода значения x
        System.out.print("Введите x: ");
        // Чтение значения x, введенного пользователем, с помощью метода nextDouble() объекта scanner
        double x = scanner.nextDouble();
        // Вычисление результата выражения, заданного в задаче, и сохранение его в переменную result
        double result = Math.log(Math.abs(Math.cos(x))) / Math.log(1 + Math.pow(x, 2));
        // Вывод результата вычислений на экран
        System.out.println("Ваш результат: " + result);
        }
        }
