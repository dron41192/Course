import java.io.*;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
        System.out.println("Для завершения записи нажмите Ctrl+D (Ctrl+Z) на новой строке");
        String allText = "";
        while (scan.hasNext()) {
            String line = scan.nextLine();
            allText += line + System.lineSeparator();
        }

        try (FileWriter fw = new FileWriter("file1.txt")) {
            fw.write(allText);
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл" + e.getMessage());
        }
        System.out.println("Файл успешно записан!" + allText);
    }
}
