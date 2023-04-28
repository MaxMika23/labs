package Lab2;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Скольки значно должно быть число: ");
        int n = scanner.nextInt();
        // Запрашиваем у пользователя сумму цифр, которую должно составлять число
        System.out.print("Скольки должна быть равна сумма чисел: ");
        int k = scanner.nextInt();
        scanner.close();

        // Находим числа, которые соответствуют заданным критериям
        findNumbers(n, k);
    }

    // Метод для поиска чисел, соответствующих заданным критериям
    private static void findNumbers(int n, int k) {
        int[] currentNumber = new int[n];
        findNumbersHelper(currentNumber, 0, k); // Вызываем вспомогательный метод
    }

    // Вспомогательный метод для поиска чисел, соответствующих заданным критериям
    private static void findNumbersHelper(int[] currentNumber, int index, int remainingSum) {
        // Если все цифры уже выбраны, проверяем сумму цифр
        if (index == currentNumber.length) {
            if (remainingSum == 0) {
                System.out.println(arrayToString(currentNumber)); // Выводим найденное число
            }
            return;
        }

        // Перебираем все возможные цифры от 0 до 9
        for (int i = 0; i <= 9; i++) {
            if (i == 0 && index == 0) {
                continue; // Первая цифра не может быть нулем
            }
            if (remainingSum - i >= 0) {
                currentNumber[index] = i; // Записываем цифру в текущее число
                findNumbersHelper(currentNumber, index + 1, remainingSum - i); // Рекурсивно вызываем метод для следующей цифры
            }
        }
    }

    // Метод для преобразования массива цифр в строку
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j);
        }
        return sb.toString();
    }

}
