public class Main {
    public static void main(String[] args) {
        int arr[] = { 20, 32, 3, 10, 9, 7, 8, 6, 17 };
        int[] newArr = mergeSort(arr, 0, arr.length - 1);
        printArr(newArr);
    }

    static int[] mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return new int[] { arr[left] };
        }
        int mid = left + (right - left) / 2;
        int[] leftArr = mergeSort(arr, left, mid);
        int[] rightArr = mergeSort(arr, mid + 1, right);
        int[] newArr = new int[leftArr.length + rightArr.length];

        int i = 0, j = 0, m = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newArr[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newArr[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newArr[m++] = rightArr[j++];
        }
        return newArr;
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
