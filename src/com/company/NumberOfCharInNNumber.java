package com.company;

import java.util.ArrayList;

//public class NumberOfCharInNNumber {
//    public static void main(String args[]){
//        int n =101;
//        int count =0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i =0;i<=n;i++){
//            list.add(i);
//        }
//        System.out.println(list);
//        for(int i =0;i< list.size();i++){
//            if(list.get(i) >= 0 && list.get(i) <= 9){
//                count++;
//            }
//            if(list.get(i) >= 10 && list.get(i) <= 99){
//                count = count+2;
//            }
//            if(list.get(i) >= 100 && list.get(i) <= 999){
//                count = count+3;
//            }
//            if(list.get(i) >= 1000 && list.get(i) <= 9999){
//                count = count+5;
//            }
//        }
//        System.out.println(count);
//    }
//}


public class NumberOfCharInNNumber {

    static int findDigits(int n)
    {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Changing number to String
        String s = String.valueOf(n);

        // add length of number to  total_sum
        return s.length() + findDigits(n - 1);
    }
    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(findDigits(n)+1);
    }
}