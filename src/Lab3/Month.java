package Lab3;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class Month {
    private static final Logger logger = Logger.getLogger(Month.class);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        logger.info("Введите номер месяца: ");
        int month = input.nextInt();

        String nextMonth;
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
                logger.error("Некорректный номер месяца.");
                return;
            }
        }

        logger.info("Следующий месяц после " + month + " - это " + nextMonth + ".");
    }
}