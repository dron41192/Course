public class Exercise15 {
    public static void main(String[] args) {
        int[] bubbleArray = {2, 4, 6, 8, 7, 2, 1, 4};
        System.out.print("Неотсортированный массив: ");
        for (int i = 0; i < bubbleArray.length; i++)
            System.out.print(bubbleArray[i] + " ");

        System.out.println("\n");
        System.out.print("Отсортированный массив: ");
        for (int i = bubbleArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bubbleArray[j] < bubbleArray[j + 1]) {
                    int tmp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = tmp;
                }
            }
            System.out.print(bubbleArray[i] + " ");
        }
    }
}