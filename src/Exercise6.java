import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        Scanner Y = new Scanner(System.in);
        Scanner Z = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = X.nextInt();
        System.out.print("Введите y: ");
        double y = Y.nextInt();
        System.out.print("Введите z: ");
        double z = Z.nextInt();
        double average = (x+y+z)/3;
        System.out.printf("Среднее арифметическое = %.1f \n" , average);
        int result = (int) average/2;
        System.out.println(result);
        if (result>3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
