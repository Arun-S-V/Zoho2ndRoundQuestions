package com.company;

public class CyclicNumber {
    public static void main(String args[]){
        long num = 142857;
        long freq = 0;
        String str = ""+num;
        for(int l =0;l<str.length();l++){
            freq = freq +  (int)str.charAt(l);
        }
        int count = 0;
        long tempNum =0;

        for(int i = 2;i<=str.length();i++){
            tempNum = i*num;
            String str1 = ""+tempNum;
            if(str.length() == str1.length()){
                int sum = 0;
                for(int j =0;j<str1.length();j++){
                   sum = sum +  (int)str1.charAt(j);
                }
                if(sum == freq){
                    count ++;
                }
            }
            else{
                System.out.println("Not a Cyclic Number");
                break;
            }
        }
        if(count == str.length()-1){
            System.out.println("Cyclic Number");
        }
        else{
            System.out.println("Not a Cyclic Number");
        }

    }
}
