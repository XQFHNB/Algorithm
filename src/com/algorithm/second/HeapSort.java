package com.algorithm.second;

/**
 * Created by XQF on 2016/11/16.
// */
//public class HeapSort {
//    //这里是建堆，不是建树。
//    public void create(int []nums){
//        int i;
//        //从最后一个非叶结点依次向下调整。
//        for(int i=n/2;i>0;i--){
//            shiftdown(i,nums);//向下调整
//        }
//    }
//
////传入一个需要向下调整的结点编号i。
//    public siftdown(int i,int []nums){
//        //flag用来标记是否需要向下调整,flag==0代表有需要
//        int t,flag=0;
//        //当i结点有左儿子并且有需要继续调整的时候就执行循环
//        while(i*2<=nums.length&&flag==0){
//            //首先判断与左儿子的关系，并记录下最小结点标号
//            if(nums[i]>nums[i*2]){
//                t=i*2;
//            }else {
//                t=i;
//            }
//            //如果有右儿子再对右儿子进行讨论
//            if(i*2+i<=n){
//                //如果右儿子的值更小，更新最小结点编号
//                if(nums[t]>nums[i*2+1]){
//                    t=i*2+1;
//                }
//            }
//
//            //最后发现自己不是最小的，说明子结点中有比父结点更小的，必须调整
//            if(t!=i){
//                swap(t,i);
//                i=t;
//            }else {
//                flag=1;//结束调整
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
