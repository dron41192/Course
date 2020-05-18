import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Введите количество строк матрицы > 0: ");
        int rowSize = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы > 0: ");
        int colSize = scanner.nextInt();

        if (colSize < 0 || rowSize < 0) {
            System.out.println("Введен не верный размер матрицы!");
            return;
        }

        int[][] array = new int[rowSize][colSize];
        System.out.println("Заполнение матрицы...");

        for (int i = 0; i < rowSize; i++) {
            System.out.printf("Введите значение %d строки через пробел \n", i);
            String[] strs = scanner.next().split(" ");

            if (strs.length != colSize) {
                System.out.println("Ошибка!");
                i--;
                continue;
            }

            for (int j = 0; j < colSize; j++) {
                array[i][j] = Integer.parseInt(strs[j]);
            }
        }

        for (int i = 0; i < colSize; i++) {
            System.out.print(array[0][i] * 3 + " ");
        }
    }
}