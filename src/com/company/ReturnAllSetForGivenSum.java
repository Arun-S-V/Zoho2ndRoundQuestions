package com.company;

public class ReturnAllSetForGivenSum {
    public static void main(String args[]){
        int array[] = new int[]{1, 4, 6, 3, 9, 8,2};
        int num = 9;
        int sum =0;
        for(int i=0;i< array.length;i++){
            if(array[i] == num){
                System.out.print("{"+array[i]+"}"+"\t");
            }
            for(int j= i+1;j<array.length;j++){
                sum = array[i]+array[j];
                if(num == sum){
                    System.out.print("{"+array[i]+","+array[j]+"}"+"\t");
                }
            }
        }
    }
}
