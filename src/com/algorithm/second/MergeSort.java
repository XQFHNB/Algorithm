package com.algorithm.second;

/**
 * Created by XQF on 2016/11/16.
 */
public class MergeSort {
    private static int[] a;
    // 原地归并核心代码，使用辅助数组进行暂存，当然有不使用辅助就可以实现的，在书上有讲，。，没时间对吧。呵呵
    public static void merge(int[] nums, int left, int medium, int right) {
        int i = left;
        int j = medium + 1;
        for (int k = left; k <= right; k++) {// k不一定为0，这有可能是原数组中的一个子数组。因此使用直接复制数组的方法在这里不合适
            a[k] = nums[k];
        }
        for (int k = left; k <= right; k++) {
            if (i > medium) {// i本身是小于medium，但是现在已经比medium大了，说明右半部分已经消耗完了，插入左半部分
                nums[k] = a[j++];
            } else if (j > right) {// 同理,j本身应该是小于right的，但是现在已经比right大了，说明左半部分已经消耗完了，插入右半部分
                nums[k] = a[i++];
            } else if (a[i] > a[j]) {// 如果右半部分的当前值比左半部分的当前值大，则插入左半部分当前值
                nums[k] = a[j++];
            } else {
                nums[k] = a[i++];// 如果右半部分比左半部分小或者等，则插入右半部分
            }
        }
        // 一个循环结束，归并就结束了，归并就是把两个排好序的子数组合并成一个大数组。
        // 一种情况是俩个数组的大小分明
        // 一种情况是你出一张我出一张，比分交替上升
    }
    // 递归回溯的三大步
    // 结束条件
    // 选择
    // 限制(本例没有限制，只有一部分操作)
    //--------------自顶向下，理解是从整个数组入手，然后层层分割，由底往上层层归并。
    public static void sort(int[] nums, int left, int right) {
        if (right <= left) {// 结束条件，必须要右大于左，否则就说明已经排序结束了
            return;
        }
        int medium = (left + right) / 2;
        sort(nums, left, medium);// 选择1，对左半边进行排序
        sort(nums, medium + 1, right);// 选择2，对右半边进行排序
        merge(nums, left, medium, right);// 操作，归并
        //为什么这里就要使用medium这个参数，不使用的话，只知道数组的两头，理论上可以实现归并，应该是很困难,我很懒不用解释了
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 3, 2, 8, 0 };
        a = new int[nums.length];
        sort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.print(" " + i);
        }
    }
}