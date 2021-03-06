package org.aidaole.algorithm4.sort;

/**
 * Sort用到的公用方法
 */
public abstract class AbstractSort {

    /**
     * 每种排序实现
     * @param arr
     */
    public abstract void sort(Comparable[] arr);

    /**
     * a和b比较，如果a小于b返回true，否则false
     * @param a
     * @param b
     * @return
     */
    protected boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * a和b小于等于比较，如果a小于等于b返回true
     * @param a
     * @param b
     * @return
     */
    protected boolean lessEqual(Comparable a, Comparable b) {
        return a.compareTo(b) <= 0;
    }

    /**
     * 交换数组中index为i和j位置的元素
     * @param arr
     * @param i
     * @param j
     */
    protected void exch(Comparable[] arr, int i, int j) {
        if (i == j) return;
        Comparable a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    /**
     * 打印数组
     * @param arr
     */
    public void show(Comparable[] arr) {
        for (Comparable c : arr) {
            System.out.printf(c + " ");
        }
        System.out.println();
    }

    /**
     * 判断数组是否从小打到排序
     * @param arr
     */
    public void isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1])) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
