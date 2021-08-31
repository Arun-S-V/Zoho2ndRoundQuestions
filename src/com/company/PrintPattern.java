package com.company;

public class PrintPattern {
    public static void main(String args[]){
        int n = 6;
        int value = 0;
        for(int i=1;i<=n;i++){
            for(int j =6;j>=6;j--){
                System.out.print("\t\t"+(value+j)+"\t\t");
                value = value +j;

            }
        }
    }
}
