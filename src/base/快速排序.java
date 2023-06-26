public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 3, 8, 6, 17 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int temp = arr[right];
        int i = -1;
        int j = 0; // 要交换的位置, 位置在j之前的数都比temp小
        while (++i <= right) {
            if (arr[i] <= temp) {
                swap(arr, i, j);
                j++;
            }
        }
        int mid = j - 1;
        quickSort(arr, left, mid - 1);
        quickSort(arr, mid + 1, right);
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
