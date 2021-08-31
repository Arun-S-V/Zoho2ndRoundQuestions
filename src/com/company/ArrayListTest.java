package com.company;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add("Arun");
        list.add("ZOHO");
        new Test().test(list);
        System.out.println(list);
    }
}
class Test{
    public void test(ArrayList list){
//        list.add("Arun");
//        list.add("ZOHO");
        list = new ArrayList();
        list.add("Kumar");
        list = null;
    }
}
