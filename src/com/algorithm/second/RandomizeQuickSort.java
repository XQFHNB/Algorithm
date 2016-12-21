package com.algorithm.second;

import java.util.Random;

/**
 * Created by XQF on 2016/12/19.
 */
public class RandomizeQuickSort {

    private int initArray[];


    public void setInitArray(int[] initArray) {
        this.initArray = initArray;
    }

    public RandomizeQuickSort() {
        // TODO Auto-generated constructor stub
    }


    public void sort(int start, int length) {//核心代码（随机位置二分排序）
        if (length <= 1)
            return;
        Random rand = new Random();
        int index = rand.nextInt(length) + start;
        int i = start - 1;

        this.swap(index, start + length - 1);
        for (int j = start; j < start + length; j++) {
            if (initArray[j] < initArray[start + length - 1]) {
                this.swap(++i, j);
            }
        }
        this.swap(++i, start + length - 1);
        sort(start, i - start + 1);
        sort(i + 1, length + start - i - 1);
    }

    public int[] quickSorted() {
        this.sort(0, initArray.length);
        return initArray;
    }

    //只能在这种情况下使用
    public void swap(int a, int b) {
        int temp = initArray[a];
        initArray[a] = initArray[b];
        initArray[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {12012, 3, 945, 965, 66, 232, 65, 7, 8, 898, 56, 878,
                170, 13, 5};
        RandomizeQuickSort sort = new RandomizeQuickSort();

        sort.setInitArray(array);
        array = sort.quickSorted();
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]= " + array[i]);
        }
    }
}


