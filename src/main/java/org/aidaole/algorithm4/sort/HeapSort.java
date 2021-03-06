package org.aidaole.algorithm4.sort;

// 堆排序是唯一一个保证查找和空间复杂度均衡的排序 N*log(N)
public class HeapSort extends AbstractSort {
    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length - 1;
        // 构建大顶堆
        for (int k = N / 2; k >= 0; k--) {
            sink(arr, k, N);
        }
        // 将堆顶放到最后，0~N-1的位置继续构建成堆
        while (N > 0) {
            exch(arr, 0, N--);
            sink(arr, 0, N);
        }
    }

    // 下沉操作：在 i*2+1和i*2+2中选择一个更大的更位置i的交换，如果交换成功则继续下沉
    private void sink(Comparable[] arr, int i, int len) {
        while (i * 2 + 1 <= len) {
            int j = i * 2 + 1;
            if (j + 1 <= len && less(arr[j], arr[j + 1])) j++;
            if (!less(arr[i], arr[j])) break;
            exch(arr, i, j);
            i = j;
        }
    }
}
