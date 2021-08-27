package com.company;

public class StarPattern {
    public static void main(String args[]){
        String str = "BackSpace123456";
        int n = str.length();
        for(int i = 0;i<n;i++){
            int j = n-i-1;
            for(int k =0;k<n;k++){
                if(k == i || k == j){
                    System.out.print(str.charAt(k));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
