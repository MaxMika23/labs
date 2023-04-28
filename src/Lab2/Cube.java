package Lab2;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем длину ребра куба от пользователя
        System.out.print("Введите длину ребра куба: ");
        double edgeLength = scanner.nextDouble();

        // Вычисляем площадь грани, площадь поверхности и объем куба
        double faceArea = Math.pow(edgeLength, 2);
        double surfaceArea = 6 * Math.pow(edgeLength, 2);
        double volume = Math.pow(edgeLength, 3);

        // Выводим результаты вычислений на экран
        System.out.println("Площадь грани куба равна: " + faceArea);
        System.out.println("Площадь поверхности куба равна: " + surfaceArea);
        System.out.println("Объем куба равен: " + volume);
    }

}
