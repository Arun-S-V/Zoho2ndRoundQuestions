package com.company;
import java.lang.*;
import java.util.*;

public class ReverseStringKeepSpacePunctuation {
    public static void main(String args[]) {
        String s = "Welcome, to Zoho Community.";
        char array[] = s.toCharArray();
        System.out.println(s);
        int i =0;
        int j = array.length-1;
        while(i<j){
            System.out.println((int)array[i]);
//            if(!((int)array[i] >= 65 && (int)array[i] <=90 || (int)array[i] >= 97 && (int)array[i] <=122 || (int)array[i] >= 48 && (int)array[i] <= 57)) {
//                i++;
//            }
//            else if(!((int)array[j] >= 65 && (int)array[j] <=90 || (int)array[j] >= 97 && (int)array[j] <=122 || (int)array[j] >= 48 && (int)array[j] <= 57)){
//                j--;
//            }
            if(!Character.isAlphabetic(array[i])){
                i++;
            }
            else if(!Character.isAlphabetic(array[j])){
                j--;
            }
            else{
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //System.out.println(Arrays.toString(array));
        String result = String.valueOf(array);
        System.out.println(result);
    }
}