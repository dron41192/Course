import java.util.Scanner;
import java.lang.String;
import java.io.*;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner inString = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Введите строку: ");
        String input = inString.next();
        System.out.println("Вы ввели: " + input);
        String result = input.replace(" ", "");
        System.out.println("получаем: "+result);
    }
}
