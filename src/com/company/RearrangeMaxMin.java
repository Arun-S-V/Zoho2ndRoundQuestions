package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeMaxMin {

    public static void main(String[] args) {
	    int array[] = new int[]{10,5,2,8,9,1,12};
        ArrayList list = new ArrayList();
        int n = array.length;
        int i =0;
        int j = n-1;
        Arrays.sort(array);
        while(i<j){
//            System.out.print(array[j--]+" ");
//            System.out.print(array[i++]+" ");
            list.add(array[j--]);
            list.add(array[i++]);
        }
        if( n%2 != 0){
//            System.out.print(array[i]);
            list.add(array[i]);
        }
        System.out.println(list);
    }
}
