package com.company;

import java.util.Arrays;

public class AddTwoBigNumberArrays {
    public static  void main(String args[]){
        int array1[] = new int[]{9,5,7,2,3,5,7};
        int array2[] = new int[]{8,5,3,4,5};

//        StringBuffer sb1 = new StringBuffer();
//        StringBuffer sb2 = new StringBuffer();
        String sb1 = "";
        String sb2 = "";
        for(int i =0;i<array1.length;i++){
            sb1 = sb1+array1[i];
        }
        for(int j =0;j<array2.length;j++){
            sb2  = sb2 +array2[j];
        }
//        long num1 = Long.parseLong(String.valueOf(sb1));
//        long num2 = Long.parseLong(String.valueOf(sb2));
        long num1 = Long.parseLong(sb1);
        long num2 = Long.parseLong(sb2);
        long num3 = num1+num2;
        //System.out.println(num1+"+"+num2+" = "+num3);
        String result = String.valueOf(num3);
        char array3[] = new char[result.length()];
        for(int k =0;k<result.length();k++){
            array3[k] = result.charAt(k);
        }
        for(int k=0;k< array1.length;k++){
            System.out.print(array3[k]+" ");
        }
    }
}
