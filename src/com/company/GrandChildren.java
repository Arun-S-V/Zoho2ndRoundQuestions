package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GrandChildren {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[][] family = new String[][]{{"luke", "shaw" },
                                            {"wayne", "rooney" },
                                            {"rooney", "ronaldo" },
                                            {"shaw", "rooney" }
                                           };
//        String[][] family = new String[4][2];
//        for(int i =0;i<4;i++){
//            for(int j =0;j<2;j++){
//                family[i][j] = scan.next();
//            }
//        }
        System.out.println("Enter the name : ");
//        String name = scan.next();
        int rowSize = family.length;
        int count =0;
       String name = scan.next();
        for(int i =0;i<rowSize;i++) {
            if (name.equals(family[i][1])) {
                String temp = family[i][0];
                for(int j=0;j<rowSize;j++){
                    if(temp.equals(family[j][1])){
                        count++;
                    }
                }
            }
        }
        System.out.println("GrandChildren Count : "+count);
    }
}