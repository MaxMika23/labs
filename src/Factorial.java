import java.util.Scanner;

public class Factorial {
    // Определяем метод main, который является точкой входа в программу
    public static void main(String[] args) {

        // Создаем объект scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести целое число
        System.out.print("Введите целое число: ");

        // Считываем введенное пользователем число
        int n = scanner.nextInt();

        // Вычисляем факториал числа n с помощью метода calculateFactorial
        int factorial = calculateFactorial(n);

        // Выводим результат на экран
        System.out.println(n + "! = " + factorial);
    }

    // Определяем метод calculateFactorial для вычисления факториала числа n
    public static int calculateFactorial(int n) {
        if (n == 0) { // если n равно 0, то возвращаем 1 (факториал 0 равен 1)
            return 1;
        } else { // в противном случае рекурсивно вызываем метод calculateFactorial для числа n-1 и умножаем результат на n
            return n * calculateFactorial(n - 1);
        }
    }

}
