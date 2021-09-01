package com.company;

import java.util.Arrays;

public class NumerOfAccuranceInArray {
    public static void main(String args[]){
        int array1[] = new int[]{4,8,4,3,2,4,3,10};
        int n = array1.length;;
        int max =array1[0];
        for(int i = 0;i<n;i++){
            if(max<array1[i]){
                max = array1[i];
            }
        }
        int array2[] = new int[max+1];
        for(int i =0;i<n;i++){
           // int a = array1[i];
            array2[array1[i]]++;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for(int i=0;i<max+1;i++){
            if(array2[i]>=1){
                System.out.println(i+"-->"+array2[i]);
            }
        }
    }
}


// Wrong method Don't Refer.............................
//public class NumerOfAccuranceInArray {
//    public static void main(String args[]){
//        int array1[] = new int[]{4,8,4,3,2,4,3,10};
//        //2 3 3 4 4 4 8 10
//        int count =1;
//        for(int i =0;i< array1.length;i++){
//            if(array1[i]  != 1000) {
//                for (int j = 1; j < array1.length; j++) {
//                    if (array1[i] == array1[j]) {
//                        array1[j] = 1000;
//                        count++;
//                    }
//                }
//            }
//            System.out.println(array1[i]+" "+count);
//            count =0;
//        }
//    }
//}