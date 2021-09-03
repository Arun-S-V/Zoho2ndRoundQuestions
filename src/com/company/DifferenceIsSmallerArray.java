package com.company;

import java.util.ArrayList;

//public class DifferenceIsSmallerArray {
//    public static void main(String args[]){
//        int array[] = new int[]{10,20,35,40,20,19};
//        ArrayList <Integer> list = new ArrayList<>();
//        int sum = 0;
//        for(int i =0;i< array.length-1;i++){
//            sum = array[i]-array[i+1];
//            sum = sum<0 ? -sum : sum;
//            list.add(sum);
//        }
//        System.out.println(list);
//        int small = list.get(0);
//        int index = 0;
//        for(int j =0;j< list.size();j++){
//            if(list.get(j)<small){
//                small = list.get(j);
//                index = j;
//            }
//        }
//        System.out.println(array[index] + " "+ array[index+1]);
//    }
//}


public class DifferenceIsSmallerArray {
    public static void main(String args[]){
        int array[] = new int[]{10,90,35,40,2};
        int fixed = array[0]-array[1];
        fixed = fixed<0 ? -fixed : fixed;
        int index1 = 0;
        int index2 = 0;
        for(int i =0;i< array.length-1;i++) {
            for (int j = i+1; j < array.length; j++) {
             int  sum = array[i] - array[j];
                sum = sum < 0 ? -sum : sum;
                if (sum<fixed) {
                    fixed = sum;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println(array[index1] + " "+ array[index2]);
    }
}