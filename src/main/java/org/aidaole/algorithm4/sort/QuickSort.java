package org.aidaole.algorithm4.sort;

import java.util.Random;

// 三点优化：
// 1. 为避免数组是有序的，选取最后一个元素作为标准，最好是经过随机选择的数然后和最后一个交换作为标准
// 2. 如果数组中包含大量重复的数，应该在partition中分为三个部分，小于，等于，大于的三个部分。然后将小于和大于两部分继续切分。荷兰国旗问题
// 3. 当切分是小数组的时候，使用插入排序替换
public class QuickSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    // 常规分治递归
    private void sort(Comparable[] arr, int left, int right) {
        if (left >= right) return;
        // 优化1：选择随机值作为标准
        int randomIndex = new Random().nextInt(right - left) + left;
        exch(arr, left, randomIndex);
        // 优化3：替换为插入排序
        // if (right <= left+M) {InsertSort.sort(arr, left, right); return;}
        int lo = left;
        for (int i = lo; i <= right; i++) {
            if (lessEqual(arr[i], arr[right])) {
                exch(arr, i, lo++);
            }
        }
        int mid = lo - 1;
        sort(arr, left, mid - 1);
        sort(arr, mid + 1, right);
    }

    // 优化2：解决大量重复数据导致的效率低下，三切分
    private void sort2(Comparable[] arr, int left, int right) {
        if (left >= right) return;
        int lo = left, i = left + 1, gt = right;
        // 以第一个元素作为基准
        Comparable v = arr[left];
        while (i <= gt) {
            int cmp = arr[i].compareTo(v);
            if (cmp < 0) exch(arr, lo++, i++);
            if (cmp > 0) exch(arr, i, gt--);
            if (cmp == 0) i++;
        }
        sort(arr, left, lo - 1);
        sort(arr, gt + 1, right);
    }
}
