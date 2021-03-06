package org.aidaole.algorithm4.sort;

public class BubbleSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        // 2. i递增直到数组最后
        for (int i = 0; i < arr.length; i++) {
            // 1. 从后往前依次比较，如果当前元素小于前一个元素则交换位置
            // 每次循环结束一个最小的元素放到 arr[i]的位置
            for (int j = arr.length - 1; j > i; j--) {
                if (less(arr[j], arr[j - 1])) {
                    exch(arr, j, j - 1);
                }
            }
        }
    }
}
