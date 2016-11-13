package com.algorithm.second;

/**
 * Created by XQF on 2016/11/13.
 */
public class Test {
    public static void swap(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int a=3,b=5;
        swap(a,b);
        System.out.println(a+" "+ b);
    }
}
