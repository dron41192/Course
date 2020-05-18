import java.util.Scanner;

import static java.lang.System.out;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        out.print("Введите переменную а: ");
        int num = scan.nextInt();

        out.println("Результат a*1 равен: " + num);
        out.println("Результат a*2 равен: " + num * 2);
        out.println("Результат a*3 равен: " + num * 3);
        out.println("Результат a*4 равен: " + num * 4);
        out.println("Результат a*5 равен: " + num * 5);
        out.println("Результат a*6 равен: " + num * 6);
        out.println("Результат a*7 равен: " + num * 7);
        out.println("Результат a*8 равен: " + num * 8);
        out.println("Результат a*9 равен: " + num * 9);
        out.println("Результат a*10 равен: " + num * 10);
    }
}
