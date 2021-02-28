package org.aidaole.algorithm4;

import org.aidaole.algorithm4.sort.*;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = RandomUtil.createIntArr(10);
        AbstractSort sort = new QuickSort();
        sort.show(arr);
        sort.sort(arr);
        sort.show(arr);
        sort.isSorted(arr);
    }
}
