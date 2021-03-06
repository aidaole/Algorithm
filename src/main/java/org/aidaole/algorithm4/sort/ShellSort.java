package org.aidaole.algorithm4.sort;

// 希尔排序是插入排序的升级，先使数组在步长区间有序，减少插入排序的比较。在数据大的时候非常有效
public class ShellSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        int h = 1;
        while (h < arr.length / 3) h = h * 3 + 1; // 1, 4, 13, 40...
        // 步长依次递减，最终降为1
        while (h >= 1) {
            // 以步长h做插入排序
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exch(arr, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
