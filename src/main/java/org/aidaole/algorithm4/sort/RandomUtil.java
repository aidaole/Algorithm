package org.aidaole.algorithm4.sort;

import java.util.Random;

public class RandomUtil {

    public static Integer[] createIntArr(int len) {
        Random random = new Random();
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
