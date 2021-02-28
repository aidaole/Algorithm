package org.aidaole.algorithm4.sort;

// 归并排序的优势在于对于任何数组都能保证n*log(n)的排序复杂度，缺点是需要使用额外的空间
public class MergeSort extends AbstractSort {

    // 使用同一个暂存交换空间
    private Comparable[] temp;

    @Override
    public void sort(Comparable[] arr) {
        temp = new Comparable[arr.length];
        sort2(arr);
    }

    // 自顶向下
    private void sort(Comparable[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    // 自底向上
    public void sort2(Comparable[] arr) {
        temp = new Comparable[arr.length];
        for (int sz = 1; sz < arr.length; sz *= 2) {
            for (int lo = 0; lo < arr.length - sz; lo += sz * 2) {
                merge(arr, lo, lo + sz - 1, Math.min(lo + sz * 2 - 1, arr.length - 1));
            }
        }
    }


    private void merge(Comparable[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        // 如果左边区域最大的arr[mid]小于右边区域最小的arr[j]，则不需要继续比较
        if (less(arr[mid], arr[j])) return;
        for (int k = left; k <= right; k++) {
            if (i > mid) temp[k] = arr[j++];
            else if (j > right) temp[k] = arr[i++];
            else temp[k] = less(arr[i], arr[j]) ? arr[i++] : arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}
