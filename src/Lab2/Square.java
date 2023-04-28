package Lab2;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
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
            int cubeOfSum = (int)Math.pow(sum, 3); // Вычисление куба суммы цифр числа
            
            // Проверка равенства квадрата исходного числа и куба суммы его цифр
            if (square == cubeOfSum) {
                System.out.println("Квадрат числа равен кубу суммы его цифр.");
            } else {
                System.out.println("Квадрат числа НЕ равен кубу суммы его цифр.");
            }
        } else {
            System.out.println("Введенное число не является трехзначным.");
        }
    }

}