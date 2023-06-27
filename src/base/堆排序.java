public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 3, 8, 6, 17 };
        heapSort(arr);
        printArr(arr);
    }

    static void heapSort(int[] arr) {
        // 构建堆结构
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[(j - 1) / 2] < arr[j]) {
                swap(arr, j, (j - 1) / 2);
                j = (j - 1) / 2;
            }
        }

        // 排序
        for (int i = arr.length - 1; i > 0; i--) {
            // 将最大的数放到最后
            swap(arr, 0, i);
            reHeapFromFirst(arr, i - 1);
        }
    }

    static void reHeapFromFirst(int[] arr, int end) {
        int i = 0;
        while (true) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (left > end) {
                break;
            }
            int swapIndex = i;
            if (left <= end && right <= end) {
                swapIndex = arr[left] > arr[right] ? left : right;
            } else if (left <= end) {
                swapIndex = left;
            }
            swap(arr, i, swapIndex);
            i = swapIndex;
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
