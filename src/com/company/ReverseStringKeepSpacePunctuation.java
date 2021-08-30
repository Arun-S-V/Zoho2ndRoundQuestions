package com.company;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class ReverseStringKeepSpacePunctuation {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        String s = "Welcome, to Zoho Community.";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch.equals(' ') || ch.equals(',') || ch.equals('.') || ch.equals(':') || ch.equals(';')) {
                map.put(i, ch);
                list.add(i);
            }
        }
        String newString = s.replaceAll("[\\s:;?.@,^]*", "");
        System.out.println(newString);
        System.out.println(map);
//        System.out.println(list);
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for()
            System.out.print(newString.substring(0,map.get(i)));
        }
    }
}
