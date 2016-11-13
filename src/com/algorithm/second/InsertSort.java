package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/11/13.
 */
public class InsertSort {


    /**
     * 插入排序就是结果集不断的满足条件增大。减少使用空间的话就使用原数组。但是也可以新开一个数组专门来放结果。虽然仍然要移动，但是好理解
     * 这里很有意思的利用了数组的特性，从尾部往前，有意思。用了个while循环进行移动，简练。
     * 把当前的数当作一个基准数，只要是前面有比它大的，统统后移，为基准数归位腾出位置。
     */
    public void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];//寄存nums[i]的值，这个时候就可以改变nums[i]的值了
            int j = i;//使用另一个指针方便描述
            if (nums[j - 1] > temp) {//如果a[j]的前一个数比a[j]大
                while (j >= 1 && nums[j - 1] > temp) {//a[j]前面的数一直比a[j]大，就一直向前寻找，同时移动数字。
                    nums[j] = nums[j - 1];
                    j--;
                }
            }
            nums[j] = temp;//终于找到一个。此时a[j]中的数已经移到a[j+1]中，于是归位
        }
    }


    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
