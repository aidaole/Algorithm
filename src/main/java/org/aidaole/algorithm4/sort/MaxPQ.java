package org.aidaole.algorithm4.sort;

public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] arr;
    private int N = 0;
    private int capacity = 0;

    public MaxPQ(int cap) {
        capacity = cap;
        // index为0的位置不存内容
        arr = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key k) {
        int index = N;
        if (N < capacity) {
            arr[++N] = k;
            index = N;
        } else {
            if (N % 2 == 0) {
                arr[index] = k;
            } else {
                index = less(N, N - 1) ? N : N - 1;
                arr[index] = k;
            }
        }
        swim(index);
    }

    public Key delMax() {
        Key max = arr[1];
        exch(1, N--);
        arr[N + 1] = null;
        sink(1);
        return max;
    }

    public void show() {
        for (Key k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private boolean less(int i, int j) {
        return arr[i].compareTo(arr[j]) < 0;
    }

    private void exch(int i, int j) {
        Key t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= arr.length) {
            int j = 2 * k;
            if (j < arr.length && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
}
