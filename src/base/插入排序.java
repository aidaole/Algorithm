public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 8, 6, 17 };
        insertSort(arr);
        printArr(arr);
    }

    static void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
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
