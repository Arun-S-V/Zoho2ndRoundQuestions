package com.company;

import java.util.ArrayList;

public class FromNumber {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        int range = 16;
        for(int i=0;i<range;i=i+2){
            int n = list.get(i) * 10+3;
            int m = list.get(i) * 10+4;
            int o = list.get(i+1) * 10+3;
            int p = list.get(i+1) * 10+4;
            list.add(n);
            list.add(m);
            list.add(o);
            list.add(p);
        }
        //System.out.println(list);
        System.out.println(list.get(range-1));
        for(int i=0;i<range-1;i++){
            System.out.println(list.get(i));
        }
    }
}
//3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343,
//3344, 3433, 3434, 3443, 3444 …