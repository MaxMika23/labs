package Lab1;

public class FizzBuzz {
// Главный метод программы
public static void main(String[] args) {
// Цикл от 1 до 500
for (int i = 1; i <= 500; i++) {
// Если число делится на 5 и 7 без остатка, выводим "fizzbuzz"
if (i % 5 == 0 && i % 7 == 0) {
System.out.println("fizzbuzz");
}
// Если число делится на 5 без остатка, выводим "fizz"
else if (i % 5 == 0) {
System.out.println("fizz");
}
// Если число делится на 7 без остатка, выводим "buzz"
else if (i % 7 == 0) {
System.out.println("buzz");
}
// В остальных случаях выводим само число
else {
System.out.println(i);
}
}
}
}