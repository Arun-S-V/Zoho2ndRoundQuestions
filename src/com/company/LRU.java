package com.company;

import java.util.LinkedHashMap;

public class LRU {
    public static void main(String args[]){
        int capacity = 3;
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(capacity);
        map.put(1,"Arun");
        map.put(2,"Aru");
        map.put(3,"Ar");
        map.put(1,"Arun");
    }
}
