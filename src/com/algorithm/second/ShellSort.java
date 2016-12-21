package com.algorithm.second;

import java.util.Arrays;

/**
 * Created by XQF on 2016/11/13.
 */
public class ShellSort {
    public void sort(int[] nums) {
        int length = nums.length;
        //确定步长
        for (int gap = length / 2; gap > 0; gap /= 2) {
            //确定了步长也就确定了序列，接下来对序列进行插入排序
            for (int i = gap; i < length; i++) {
                //根据gap抓住突破口，把这个数与序列中其他数进行比较，同样是采用从尾部入手的办法
                int temp = nums[i];
                int j;
                //每隔gap步长个数才是序列中的元素,这里用一个while循环更加简练
                for (j = i - gap; j >= 0; j -= gap) {
                    //如果从序列尾部开始的数比temp大，则当前数字后移，为temp中的数腾出位置
                    if (temp < nums[j]) {
                        //后移gap位才是序列中的数的位置
                        nums[j + gap] = nums[j];
                    } else {
                        break;
                    }
                }
                //已经找到了要插入的位置,j的值表示，j位置上的数比temp中的数小，因此temp中的数应该放在j的后gap位上
                nums[gap + j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 6, 8, 2};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
