package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/12/19.
 */
public class QuickSort3Way {

    public void sort(int[] num, int left, int right) {
        System.out.println(left + "   " + right);
        if (left >= right) {
            return;
        }
        int i = left + 1;
        int m = left, n = right;
        int v = num[left];//基准数


        //用索引而不是值，继续下去的条件是还没碰撞,i==n也要进行比较
        while (i <= n) {


            //当指针所指当前数比基准数小，要移到(left,m)之间,于是当前数和m指针所指的数进行不可描述（交换）
            if (num[i] < v) {
                int temp = num[i];
                num[i] = num[m];
                num[m] = temp;
                i++;
                m++;
            } else if (num[i] > v) {//当前指针所指的数比基准数大，要移到（n,right)之间，于是当前数和n指针所指的数进行交换
                int temp = num[i];
                num[i] = num[n];
                num[n] = temp;
                n--;
                //为什么这里不将i指针进行移动i++?
                //因为交换过后有可能还要进行比较，不能直接走了，交换过来的数可能仍比基准数大
            } else {
                i++;//这是和基准数相等的时候，相等就不用移动了
            }

        }
        //每次交换后指针都进行了移动
        sort(num, left, m - 1);
        sort(num, n + 1, right);

    }

    public static void main(String[] args) {
        QuickSort3Way sort3Way = new QuickSort3Way();
        int[] nums = {8, 2, 5, 6, 8, 2};

        sort3Way.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }
}
