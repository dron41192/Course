import java.util.Scanner;

public class OneOrNothing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = s.nextInt();
        if (a==1)
            System.out.println("Вы ввели число 1");
        else System.exit(0);
    }

}
