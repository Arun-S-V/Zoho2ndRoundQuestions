package com.company;

public class PrintPattern {
    public static void main(String args[]){
        int n = 6;
        for(int i=0;i<n;i++){
            System.out.print((i+1)+"   ");
            int h=n;
            for(int j =i+1;j<n;j++){
                int sum =0;
                sum = sum+h;
                System.out.print((sum+h)+"   ");
                h--;
            }
//            h--;
//            sum =0;
            System.out.println();
        }
    }
}
