package Lab2;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Вывод на экран запроса на ввод номера месяца
        System.out.print("Введите номер месяца: ");
        // Считывание номера месяца из ввода пользователя
        int month = input.nextInt();

        // Объявление переменной nextMonth для хранения следующего месяца
        String nextMonth;
        // Использование оператора switch для выбора следующего месяца на основе введенного номера месяца
        switch (month) {
            case 1 -> nextMonth = "февраль";
            case 2 -> nextMonth = "март";
            case 3 -> nextMonth = "апрель";
            case 4 -> nextMonth = "май";
            case 5 -> nextMonth = "июнь";
            case 6 -> nextMonth = "июль";
            case 7 -> nextMonth = "август";
            case 8 -> nextMonth = "сентябрь";
            case 9 -> nextMonth = "октябрь";
            case 10 -> nextMonth = "ноябрь";
            case 11 -> nextMonth = "декабрь";
            case 12 -> nextMonth = "январь";
            default -> {
                // Вывод сообщения об ошибке, если номер месяца некорректный
                System.out.println("Некорректный номер месяца.");
                // Выход из программы
                return;
            }
        }

        // Вывод на экран следующего месяца
        System.out.println("Следующий месяц после " + month + " - это " + nextMonth + ".");
    }

}
