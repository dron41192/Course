import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        final int X = 1, Y = 3, Z = 5;
        Scanner Number = new Scanner(System.in);
        System.out.println("Введите переменную number: ");
        int number = Number.nextInt();
        String check="Данное значение имеется в константах";

        switch (number) {
            case X:
            case Y:
            case Z:
                break;
            default:
                check = "Такой константы нет!";
                break;
        }
        System.out.println(check);
    }
}
