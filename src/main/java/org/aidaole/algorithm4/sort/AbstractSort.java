package org.aidaole.algorithm4.sort;

public abstract class AbstractSort {

    public abstract void sort(Comparable[] arr);

    protected boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    protected boolean lessEqual(Comparable a, Comparable b) {
        return a.compareTo(b) <= 0;
    }

    protected void exch(Comparable[] arr, int i, int j) {
        if (i == j) return;
        Comparable a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public void show(Comparable[] arr) {
        for (Comparable c : arr) {
            System.out.printf(c + " ");
        }
        System.out.println();
    }

    public void isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1])) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
