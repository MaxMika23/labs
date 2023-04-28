package Lab2;

import java.util.Scanner; //комментарий

public class GeometricProgression {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите количество членов геометрической прогрессии: ");
       // Считывание количества членов геометрической прогрессии      
       int n = scanner.nextInt();
       // Инициализация первого члена геометрической прогрессии
       int firstTerm = 3;
       // Инициализация общего отношения геометрической прогрессии
       int commonRatio = 2;

       // Инициализация переменной суммы
       int sum = 0;
       // Цикл для вычисления суммы первых n членов геометрической прогрессии
       for (int i = 0; i < n; i++) {
           // Вычисление i-го члена геометрической прогрессии
           int term = firstTerm * (int) Math.pow(commonRatio, i);
           // Добавление i-го члена к сумме
           sum += term;
       }
       // Вывод суммы первых n членов геометрической прогрессии
       System.out.println("Сумма первых " + n + " членов геометрической прогрессии: " + sum);
   }

}
