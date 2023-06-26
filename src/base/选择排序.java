public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 8, 6, 17 };
        selectSort(arr);
        printArr(arr);
    }

    static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            int maxPos = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxPos]) {
                    maxPos = j;
                }
            }
            swap(arr, i, maxPos);
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
