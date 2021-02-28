package org.aidaole.algorithm4.sort;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

// 希尔排序是插入排序的升级，先使数组局部有序，减少插入排序的比较。在数据大的时候非常有效
public class ShellSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        int h = 1;
        while (h < arr.length / 3) h = h * 3 + 1; // 1, 4, 13, 40...
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exch(arr, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
