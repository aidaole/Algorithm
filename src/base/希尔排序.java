public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 3, 8, 6, 17 };
        shellSort(arr);
        printArr(arr);
    }

    static void shellSort(int[] arr) {
        int len = arr.length;
        int gap = len;
        while (true) {
            gap /= 2;
            // 步进为gap的插入排序
            for (int i = gap; i < len; i += gap) {
                for (int j = i; j > 0; j -= gap) {
                    if (arr[j - gap] > arr[j]) {
                        swap(arr, j, j - gap);
                    } else {
                        break;
                    }
                }
            }
            if (gap == 1)
                break;
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
