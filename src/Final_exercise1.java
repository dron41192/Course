import java.lang.reflect.Array;
import java.util.Scanner;

public class Final_exercise1 {
    public static void main(String[] args) {
        int binary = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String s = input.next();

        int length = s.length();
        int g = length;

        for (int i = 0; i < length; i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num >= 2) {
                System.out.println("Двоичное число должно состоять из 1 и 0");
                System.exit(0);
            }

            binary += Math.pow(2, --g) * num;
        }
        System.out.println("Результат перевода из двоичного " + s + " в десятичное равно: " + binary);
    }
}
