package com.company;

import java.util.Scanner;

public class GrandChildren {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[][] family = new String[][]{{"luke", "shaw" },
                                            {"wayne", "rooney" },
                                            {"rooney", "ronaldo" },
                                            {"shaw", "rooney" }
                                           };
        int rowSize = family.length;
        int count =0;
        System.out.println("Enter the name : ");
        String name = scan.nextLine();
//        String name = "ronaldo";
        for(int i =0;i<rowSize;i++) {
            if (name == family[i][1]) {
                String temp = family[i][0];
                for(int j=0;j<rowSize;j++){
                    if(temp == family[j][1]){
                        count++;
                    }
                }
            }
        }
        System.out.println("GrandChildren Count : "+count);
    }
}