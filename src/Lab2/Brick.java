package Lab2;

import java.util.Scanner;

public class Brick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры отверстия (A B):"); // Запрос на ввод размеров отверстия
        int a = scanner.nextInt(); // Считывание первого числа (A)
        int b = scanner.nextInt(); // Считывание второго числа (B)

        System.out.println("Введите размеры кирпича (X Y Z):"); // Запрос на ввод размеров кирпича
        int x = scanner.nextInt(); // Считывание первого числа (X)
        int y = scanner.nextInt(); // Считывание второго числа (Y)
        int z = scanner.nextInt(); // Считывание третьего числа (Z)

        // Проверяем, может ли кирпич пройти через отверстие, если хотя бы одна из шести комбинаций
        // двух сторон отверстия и двух сторон кирпича имеет размеры кирпича меньше размеров отверстия.
        if ((x <= a && y <= b) || (x <= b && y <= a) ||
            (y <= a && z <= b) || (y <= b && z <= a) ||
            (x <= a && z <= b) || (x <= b && z <= a)) {
            System.out.println("Кирпич пройдет через отверстие"); // Выводим сообщение, что кирпич пройдет через отверстие
        } else {
            System.out.println("Кирпич не пройдет через отверстие"); // Выводим сообщение, что кирпич не пройдет через отверстие
        }

        scanner.close(); // Закрываем Scanner
    }

}
