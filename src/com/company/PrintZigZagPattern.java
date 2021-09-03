package com.company;

import java.util.Arrays;

public class PrintZigZagPattern {
    public static void main(String args[]){
        int array[] = new int[]{3,4,6,2,1,8,9};
        boolean flag = true;
        for(int i =0;i< array.length-1;i++){
            if(flag){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            else{
                if(array[i]<array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(array));
    }
}
