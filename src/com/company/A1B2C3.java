package com.company;

import java.util.Scanner;


public class A1B2C3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();

        for(int j=0; j<str.length(); j++) {
            char a = str.charAt(j);
            j++;
            int b = ((int)str.charAt(j)-48);

            if(j+1 >= str.length()) {
                for(int i=0; i<b; i++)
                    System.out.print(" 1st "+a);
                break;
            }

            if (((int)str.charAt(j+1)-48)>1 && ((int)str.charAt(j+1)-48)<10) {
                j++;
                b = (b*10) + ((int)str.charAt(j)-48);
            }

            for(int i=0; i<b; i++)
                System.out.print("  2nd "+a);
        }
    }
}