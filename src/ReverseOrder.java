import java.util.Scanner;
// Объявляем класс ReverseOrder
public class ReverseOrder {
// Объявляем метод main
public static void main(String[] args) {
// Создаем экземпляр класса Scanner для получения ввода пользователя
Scanner scanner = new Scanner(System.in);
// Выводим сообщение, запрашивая у пользователя ввод текста
System.out.print("Введите текст: ");
// Получаем ввод пользователя и сохраняем его в переменной input
String input = scanner.nextLine();
// Разбиваем ввод пользователя на отдельные слова и сохраняем их в массиве words
String[] words = input.split(" ");
// Проходим по массиву слов в обратном порядке
for (int i = words.length - 1; i >= 0; i--) {
    // Получаем текущее слово
    String word = words[i];
    // Проходим по буквам текущего слова в обратном порядке
    for (int j = word.length() - 1; j >= 0; j--) {
        // Выводим текущую букву
        System.out.print(word.charAt(j));
    }
    // Выводим пробел после каждого слова
    System.out.print(" ");
}
}
}
