package com.company;

public class MultiplyTwoNumberUsingPlusOperator {
    public static void main(String args[]){
        int n1 = 30;
        int n2 = 4;
        int min,max;
        int result  = 0;
        if(n1<n2){
            min = n1;
            max = n2;
        }
        else{
            min = n2;
            max = n1;
        }
        for(int i =0;i<min;i++){
            result = result+max;
            System.out.println(result);
        }
        System.out.println(result);
    }
}