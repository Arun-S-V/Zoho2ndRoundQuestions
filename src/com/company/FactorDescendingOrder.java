package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorDescendingOrder {
    public static void main(String args[]) {
        int array[] = new int[]{1,2,3,4,5,6,10,12,100,1000,999999999};
        int arraySize = array.length;
        int newArray [] = new int [arraySize];
        int count = 0;
        for (int j = 0; j < arraySize; j++) {
            for (int i = 1; i <array[j]; i++) {
                if (array[j] % i == 0) {
                    count++;
                }
            }
            newArray[j] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(newArray));
        for(int i=0;i<arraySize;i++) {
            for(int j=0;j<arraySize;j++) {
                if(newArray[i]>newArray[j]) {
                    int temp,temp1;
                    temp=newArray[i];
                    newArray[i]=newArray[j];
                    newArray[j]=temp;
                    temp1=array[i];
                    array[i]=array[j];
                    array[j]=temp1;
                }
            }
        }
        for(int i=0;i<arraySize;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
