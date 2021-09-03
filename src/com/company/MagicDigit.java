package com.company;

public class MagicDigit {
    public static void main(String args[]){
        long num = 12634;
        long sum = 0;
        while(num >0 || sum>9){
            if(num == 0){
                num = sum;
                sum = 0;
            }
            sum = sum + num%10;
            num = num /10;
        }
        if(sum == 1){
            System.out.println("Magic Digit");
        }
        else{
            System.out.println("Not a Magic Digit");
        }
    }
}