import java.util.Scanner;

import static java.lang.System.out;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Переменные должны быть больше 10 и меньше 1");

        System.out.print("Введите переменную а: ");
        int s = scan.nextInt();
        if (s > 10 || s < 1) {
            System.out.println("Вы ввели значение которое выходит за рамки условия задачи!");
            System.exit(0);
        }

        out.println("Результат a*1 равен: " + s);
        out.println("Результат a*2 равен: " + s * 2);
        out.println("Результат a*3 равен: " + s * 3);
        out.println("Результат a*4 равен: " + s * 4);
        out.println("Результат a*5 равен: " + s * 5);
        out.println("Результат a*6 равен: " + s * 6);
        out.println("Результат a*7 равен: " + s * 7);
        out.println("Результат a*8 равен: " + s * 8);
        out.println("Результат a*9 равен: " + s * 9);
        out.println("Результат a*10 равен: " + s * 10);
    }
}
