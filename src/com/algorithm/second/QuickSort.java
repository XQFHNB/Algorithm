package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/11/13.
 */
public class QuickSort {
    public void sort(int[] nums, int left, int right) {
        int i = left;
        int j = right;


//递归调用肯定有一个结束条件，而这个结[v束条件就是在内部判断开始前判断left与right.最后结束的时候子数组大小为1
        if (left >= right) {
            return;
        }

        int temp = nums[left];//设置基准数,与后面两句构成三变量交换，6666

        //退出这个循环的时候，哨兵相遇
        while (i != j) {
            //一定是右边的哨兵先走，。，。，寻找到比基准数小的数停下退出
            while (nums[j] >= temp && i < j) {
                j--;
            }
            //寻找比基准数大的数停下退出


            while (nums[i] <= temp && i < j) {
                i++;
            }
            //交换各自停下的当前数
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        //哨兵相遇之后就将基准数归位
        nums[left] = nums[i];
        nums[i] = temp;//到这一步基准数就已经归位了


        //一轮过后就将大数组划分为两个小数组，一边所有的数比刚刚的基准数大，一边比刚刚的基准数小。
        //接下来就是分治对两个小数组执行同样的操作
        sort(nums, left, i - 1);
        sort(nums, i + 1, right);
        return;
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }
}
