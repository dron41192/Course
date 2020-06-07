import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner inString = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Введите строку 1: ");
        String string1 = inString.next();
        System.out.print("Введите строку 2: ");
        String string2 = inString.next();
        if (string1.length() > string2.length()) {
            System.out.println("Строка с наибольшей длинной: " + string1.length());
        } else if (string1.length() == string2.length()) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строка с наибольшей длинной: " + string2.length());
        }
    }
}
