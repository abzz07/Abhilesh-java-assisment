import java.util.Arrays;

public class SortingMethods {

    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};
        int[] b = {5, 2, 8, 1, 3};

        selectionSort(a);
        insertionSort(b);

        System.out.println("Selection Sort: " + Arrays.toString(a));
        System.out.println("Insertion Sort: " + Arrays.toString(b));
    }
}
