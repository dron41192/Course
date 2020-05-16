import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String a = s.next();
        int r = Integer.parseInt(a,2);
        System.out.println("Результат перевода в десятичную систему: "+r);
    }
}
