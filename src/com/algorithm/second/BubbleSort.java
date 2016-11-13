package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/11/13.
 */
public class BubbleSort { 

/**
*原本是最熟悉的，结果没写出来，悲哀，。，。大三了连个冒泡都费时间。原理是理解了得，相邻两个数交换下沉。
*只是每次都是从数组起始开始，我一直以为是当前数组元素开始
*/

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
