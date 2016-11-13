package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/11/13.
 */
public class SelectSort {
/**
* 从代码中分析选择排序就是选择一个数作为基准数然后与后面的数进行最小值或最大值的比较。
 * 至于稳定性，一定是不稳定的。因为相等大小的数在比较时会蜜汁交换位置，                           
 * 时间O(n^2)。最好情况是合乎条件的有序数组，不用交换。最坏就是合乎条件的逆序数组。每次都要交换。
*/
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    int temp = min;
                    min = nums[j];
                    nums[j] = temp;
                }
            }
            nums[i] = min;
        }
    }


    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
