import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = input.next();
        int X = Integer.parseInt(S);
        double Y = Double.parseDouble(String.valueOf(X));

        System.out.println("Переменная S типа String равна: " + S + "\n" + "Переменная X типа Integer равна: " + X + "\n" + "Переменная Y типа Double равна: " + Y);

    }
}
