package com.algorithm.second;

/**
 * Created by XQF on 2016/11/13.
 */
public class BucketSort {

    public void sort(int[] nums) {
        int[] array = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]]++;
        }
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array[i];j++){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(nums);
    }
}
