import java.util.Scanner;

//объявляем класс PrimeNumbers
public class PrimeNumbers {
//объявляем метод main, который будет запускать программу
public static void main(String[] args) {
//создаем объект класса Scanner
Scanner sc = new Scanner(System.in);
//выводим сообщение на экран и считываем первое число
System.out.print("Введите первое целое число: ");
int num1 = sc.nextInt();
//выводим сообщение на экран и считываем второе число
System.out.print("Введите второе целое число: ");
int num2 = sc.nextInt();
//выводим сообщение на экран и считываем третье число
System.out.print("Введите третье целое число: ");
int num3 = sc.nextInt();

// проверяем, является ли каждое введенное число простым
if (isPrime(num1)) {
    System.out.println(num1 + " является простым числом.");
}
if (isPrime(num2)) {
    System.out.println(num2 + " является простым числом.");
}
if (isPrime(num3)) {
    System.out.println(num3 + " является простым числом.");
}
}

//метод для проверки, является ли число простым
public static boolean isPrime(int num) {
if (num <= 1) {
    return false;
}
// проверяем, есть ли у числа делители от 2 до корня из числа
for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
        return false;
    }
}
return true;
}
}