package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRU {
    public static void main(String args[]){
        int capacity = 3;
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(2);

        Queue<Integer> q = new LinkedList<Integer>();

        map.put(1,"Arun");
        map.put(2,"Aru");
        map.put(3,"Ar");
        map.put(1,"Arun");
        map.put(5,"kamal");
        map.put(7,"kamal");

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(map);
        System.out.println(q);
    }
}
