package com.company;

import java.util.ArrayList;

public class ThresholdOfArray {
    public static void main(String args[]) {
        int array[] = new int[]{5,8,10,13,6,2};
        ArrayList<Integer> list = new ArrayList();
        int thresHold = 3;
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] <= thresHold){
                count = 1;
                list.add(count);
            }
            else {
                int qu = array[i] / thresHold;
                int rem = array[i] % thresHold;
                if(rem == 0){
                    list.add(qu);
                }
                else {
                    count = qu + 1;
                    list.add(count);
                }
            }
            count = 0;
        }
        System.out.println(list);
        int sum = 0;
        for(int i =0;i< list.size();i++){
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}



/*
package com.company;

import java.util.ArrayList;

public class ThresholdOfArray {
    public static void main(String args[]) {
        int array[] = new int[]{5,8,10,13,6,2};
        int thresHold = 3;
        int sum =0;
        for(int i=0;i<array.length;i++){
            if(array[i] <= thresHold){
                sum =sum +1;
            }
            else {
                int qu = array[i] / thresHold;
                int rem = array[i] % thresHold;
                if(rem == 0){
                    sum = sum+qu;
                }
                else {
                    sum = sum+qu+1;
                }
            }
            count = 0;
        }
        System.out.println(sum);
    }
}

*/