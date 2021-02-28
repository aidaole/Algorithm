package org.aidaole.algorithm4.sort;

// 如果数组基本就有序，插入排序是最快的
public class InsertSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j - 1);
            }
        }
    }
}