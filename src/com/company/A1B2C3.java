package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A1B2C3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int array[] = new int[str.length()];
        for(int i =0;i<str.length();i++){
            array[i] = str.charAt(i)-48;
        }
        //System.out.println(Arrays.toString(array));

        for(int i =0;i<array.length;i++){
           System.out.print((char)((65+array[i])-1)+" ");
        }
    }
}