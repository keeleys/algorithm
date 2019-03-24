package cc.sitec;

import org.junit.Test;

public class BubbleTest {

    @Test
    public void bubbleSort() {
        System.out.println("=====冒泡排序=====");
        SimpleSort bubble = new SimpleSort();
        bubble.print();
        bubble.bubbleSort();
        bubble.print();
    }
    @Test
    public void selectSort() {
        System.out.println("=====选择排序=====");
        SimpleSort bubble = new SimpleSort();
        bubble.print();
        bubble.selectSort();
        bubble.print();
    }

    @Test
    public void insertSort() {
        System.out.println("=====插入排序=====");
        SimpleSort bubble = new SimpleSort();
        bubble.print();
        bubble.insertSort();
        bubble.print();
    }
}