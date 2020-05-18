import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String Binary = scan.next();
        int Des = Integer.parseInt(Binary,2);
        System.out.println("Результат перевода в десятичную систему: "+Des);
    }
}
