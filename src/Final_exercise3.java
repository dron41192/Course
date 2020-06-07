import java.util.Scanner;

import static java.lang.Math.round;

public class Final_exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double course = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double countRub = scanner.nextDouble();
        double result = round(countRub * 100.0 / course) / 100.0;
        System.out.printf("%.0f рублей =  %.2f долларов", countRub, result);
    }
}
