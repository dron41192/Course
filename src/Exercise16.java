import java.io.*;

public class Exercise16 {
    public static void main(String[] args) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода " + exc);
        }
    }
}

