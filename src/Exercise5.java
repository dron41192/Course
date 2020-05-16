import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        System.out.println("Переменные должны быть больше 10 и меньше 1");

        System.out.print("Введите переменную а: ");
        int s = a.nextInt();
        if (s>10 || s<1) {
            System.out.println("Вы ввели значение которое выходит за рамки условия задачи!");
            System.exit(0);
        }
        System.out.print("Введите переменную b: ");
        int d = b.nextInt();
        if (d>10 || d<1) {
            System.out.println("Вы ввели значение которое выходит за рамки условия задачи!");
            System.exit(0);
        }
        int res=s*d;

        System.out.print("Результат a*b равен: "+res);
    }
}
