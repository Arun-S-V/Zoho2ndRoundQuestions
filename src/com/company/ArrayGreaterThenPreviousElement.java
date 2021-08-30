package com.company;

public class ArrayGreaterThenPreviousElement {
    public static void main(String args[]){
        int array[] = new int[]{10, 4, 6, 3, 5 };
        System.out.print(array[0]+" ");
        for(int i =0;i< array.length-1;i++){
            if (array[i] < array[i+1]) {
                System.out.print(array[i+1] + " ");
            }
        }
    }
}
