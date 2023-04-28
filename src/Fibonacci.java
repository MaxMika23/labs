import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Запрашиваем количество чисел в последовательности у пользователя
        System.out.print("Введите количество нужных вам чисел последовательности Фибоначчи: ");
        int numTerms = input.nextInt();

        // Инициализируем первые два числа последовательности
        int firstTerm = 0, secondTerm = 1;

        // Выводим сообщение пользователю о количестве чисел, которые будут сгенерированы
        System.out.print("Фаша последовательность составленная из " + numTerms + " чисел:\n");

        // Генерируем последовательность Фибоначчи с помощью цикла for
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            // Вычисляем следующее число последовательности
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
