package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Level_1_2_Friends {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[][] matrix = new String[][]{
                                            {"Ram", "Syam"},
                                            {"Akil", "Syam"},
                                            {"Nikil", "Ram"},
                                            {"Subhash", "Ram"},
                                            {"Karthik", "Akil"},
                                            {"Arun","Subhash"}
                                          };
        System.out.println("Enter the name to be search : ");
        String name = scan.next();
        System.out.println("Enter the level : ");
        int level = scan.nextInt();
        if(level == 1) {
            int l1Count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (name.equals(matrix[i][1])) {
                    l1Count++;
                }
            }
            System.out.println(l1Count);
        }
        if(level>1){
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (name.equals(matrix[i][1])) {
                    String temp = matrix[i][0];
                    for (int j = 0; j < matrix.length; j++) {
                        if (temp.equals(matrix[j][1])) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}