package com.company;

public class PrintAZValue {
    public static void main(String args[]) {
        int number = 51;
        StringBuilder str = new StringBuilder();
        while(number >0){
            int rem = number%26;
            if(rem == 0){
                str.append("Z");
                number = (number/26)-1;
            }
            else{
                str.append((char)((rem-1)+'A'));
                number = number/26;
            }
        }
        System.out.print(str.reverse());
    }
}