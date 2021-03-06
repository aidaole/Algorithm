package org.aidaole.algorithm4.sort;

public class InsertSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 1. 从j开始往前比较，如果小于前一个数就交换。
            // 只需要与前一个数比价，如果数组基本是有序的，插入排序非常高效
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j - 1);
            }
        }
    }
}