package org.aidaole.algorithm4.sort;

public class SelectionSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            // 1. 每次遍历数组，选择数组中值最小的minIndex元素，与第i个元素交换
            for (int j = i; j < arr.length; j++) {
                if (less(arr[j], arr[minIndex])) {
                    minIndex = j;
                }
            }
            // 2. 交换第i和minIndex元素
            exch(arr, i, minIndex);
        }
    }
}
