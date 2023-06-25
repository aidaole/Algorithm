public class Main {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 10, 9, 8, 7, 6, 17 };
        bubbleSort(arr);
        printArr(arr);
    }

    static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int j = len - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d,", arr[i]);
        }
        System.out.println();
    }
}