package cc.sitec;

import java.util.Random;
import java.util.logging.Logger;

public class SimpleSort {
    private static Logger log = Logger.getLogger("test");

    private int[] arr;

    public SimpleSort() {
        final int maxSize = 20;
        Random random = new Random();
        arr = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d - ", arr[i]);
        }
        System.out.println();
    }

    private void swap(int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    /**
     * 冒泡排序
     */
    public void bubbleSort() {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    this.swap(j, j + 1);
                }
            }
        }
    }

    /**
     * 选择
     */
    public void selectSort() {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                this.swap(min, i);
            }
        }
    }


    /**
     * 插入排序
     */
    public void insertSort() {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            // 当前对比的下标 默认从要对比的index开始
            int currentIndex = i;
            // 当前下标对应的值
            int currentValue = arr[currentIndex];

            // 如果当前下标的值小于前一个,那么当前 坐标的值 等于 前一个
            while (currentIndex > 0 && arr[currentIndex - 1] > currentValue) {
                arr[currentIndex] = arr[currentIndex-1];
                currentIndex--;
            }
            // 上面计算完了之后 currentIndex 就最后一次满足的 被替换的 前一个的值了
            arr[currentIndex] = currentValue;
        }
    }
}
