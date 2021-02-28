package org.aidaole.algorithm4.sort;

public class BubbleSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (less(arr[j], arr[j - 1])) {
                    exch(arr, j, j - 1);
                }
            }
        }
    }
}
