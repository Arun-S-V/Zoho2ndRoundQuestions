package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOddNumberBetweenRang{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 =  scan.nextInt();
        ArrayList<Integer> list= findOddNumberBetweenRange(num1,num2);
        System.out.println();
        System.out.println(list);
    }
    public static ArrayList<Integer> findOddNumberBetweenRange(int num1, int num2) {
        ArrayList<Integer> answerList = new ArrayList<>();
        if (num2 == 0) {
            System.out.println("You Entered Null Values");
        }
        else {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    answerList.add(i);
                }
            }
        }
        return answerList;
    }
}
