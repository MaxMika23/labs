package Lab2;

public class Multiplication {
    public static void main(String[] args) {
        int n = 5; 
        double p = 1.0; 

        // Запускаем цикл от 1 до n включительно
        for (int i = 1; i <= n; i++) {
            p *= (1 - 1.0/(2*i)); // Умножаем значение p на выражение (1 - 1.0/(2*i))
        }

        // Выводим результат умножения переменной p на выражение (1 - 1.0/(2*i))
        System.out.println("P = " + p); 
    }

}
