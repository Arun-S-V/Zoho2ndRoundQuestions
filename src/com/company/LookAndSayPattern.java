package com.company;

import java.util.Scanner;

public class LookAndSayPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        String str = "1";
        System.out.println(str.length());
        int i =1;
        while(i<value){
            String new_str = "";
            int count = 1;
            char a = str.charAt(0);
            for(int j =1;j<str.length();j++){
                if(str.charAt(j) != str.charAt(j-1)){
                    System.out.print(count + "" +a);
                    new_str += ""+count+""+a;
                    a = str.charAt(j);
                    count = 1;
                }
                else{
                    count++;
                }
            }
            System.out.println(count + "" +a);
            new_str += ""+count+""+a;
            str = new_str;
            i++;
        }
    }
}


