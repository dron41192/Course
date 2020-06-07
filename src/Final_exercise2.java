import java.util.Scanner;

public class Final_exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        if (arraySize < 0) {
            System.out.println("Введен не верный размер массива!");
            return;
        }

        int[] array = new int[arraySize];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Вы ввели массив: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        //сортировка прямого выбора
        for (int i = 0; i < arraySize; i++) {
            int minPosition = i;

            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                    array[minPosition] = array[j];
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }

        System.out.print("\nМассив отсортированный методом сортировки прямого выбора: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
