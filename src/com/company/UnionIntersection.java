package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnionIntersection {
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);
        Collections.addAll(list2, 1, 2, 7, 9, 5);
        list4.addAll(list1);
        list4.addAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    list3.add(list1.get(i));
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}
//        for(int k =0;k<list3.size();k++){
//            for(int l =0;l<list4.size();l++){
//                if(list3.get(k) != list4.get(l)){
//                    System.out.println(list4.get(k));
//                }
//            }
//
//        }
//      System.out.println(list3+" "+list4);
//    }
//}
