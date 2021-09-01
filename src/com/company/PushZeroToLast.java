package com.company;

import java.util.Arrays;

public class PushZeroToLast {
    public static void main(String args[]){
        int array[] = new int[]{1,4,0,7,8,0,4,6,7,0,9,8,61,0,97,0,78,0,5,0,1,0};
        int array1[] = new int[array.length];
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }
        for(int i=count;i<array.length;i++){
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}