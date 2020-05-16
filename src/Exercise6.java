import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите x: ");
        int x = scan.nextInt();
        System.out.print("Введите y: ");
        int y = scan.nextInt();
        System.out.print("Введите z: ");
        int z = scan.nextInt();
        double average = ((double)x+y+z)/3;
        System.out.printf("Среднее арифметическое = %.1f \n" , average);
        int result = (int) average/2;
        System.out.println(result);
        if (result>3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
