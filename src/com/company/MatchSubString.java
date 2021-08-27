package com.company;

import java.util.ArrayList;

public class MatchSubString {
    public static void main(String args[]){
        boolean answer = true;
        String str = "arunop12";
        String target = "123";
        int n = str.length();
        int subN = target.length();
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(int j =0;j<subN;j++) {
            for (i = 0; i < n; i++) {
                if (target.charAt(j) == str.charAt(i)) {
                    //System.out.println(i);
                    list.add(i);
                }
            }
        }
        if(list.size() == subN) {
          //  System.out.println(list);
            System.out.println(list.get(0));
        }
        else{
            System.out.println(-1);
        }
    }
}
