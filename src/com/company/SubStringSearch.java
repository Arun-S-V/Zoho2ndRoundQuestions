package com.company;

import java.util.Scanner;

public class SubStringSearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Big String : ");
        String bigStr = scan.next();
        System.out.println("Enter the Small String : ");
        String smallStr = scan.next();
        int result = isSubString(bigStr,smallStr);
        if(result == -1)
            System.out.println("Not Present");
        else
            System.out.println("Present in place of : "+result);
    }
    public static int isSubString(String bigStr,String smallStr){
        int len1 = bigStr.length();
        int len2 = smallStr.length();
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (bigStr.charAt(i + j) != smallStr.charAt(j)) {
                    break;
                }
            }
            if (j == len2)
                return i;
        }
        return -1;
    }
}
