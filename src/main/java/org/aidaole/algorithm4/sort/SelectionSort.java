package org.aidaole.algorithm4.sort;

public class SelectionSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (less(arr[j], arr[minIndex])) {
                    minIndex = j;
                }
            }
            exch(arr, i, minIndex);
        }
    }
}
