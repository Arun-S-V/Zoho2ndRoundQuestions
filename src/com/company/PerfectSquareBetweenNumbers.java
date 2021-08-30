package com.company;

public class PerfectSquareBetweenNumbers {
    public static void main(String args[]){
        //int result = 0;
        int smallNum = 10;
        int bigNum = 160;
        for(int i =smallNum;i<=bigNum;i++){
            for(int j = 1;j*j<=i;j++){
                if(j*j == i){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
