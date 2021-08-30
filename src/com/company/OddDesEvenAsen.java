package com.company;

import java.util.*;

class OddDesEvenAsen {

    static void bitonicGenerator(int arr[], int n)
    {
        // create evenArr[] and oddArr[]
        ArrayList<Integer> evenArr = new ArrayList<Integer>();
        ArrayList<Integer> oddArr = new ArrayList<Integer>();

        // Put elements in oddArr[] and evenArr[] as
        // per their position
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenArr.add(arr[i]);
            }
            else if(i % 2 != 0) {
                oddArr.add(arr[i]);
            }
        }
        // sort evenArr[] in ascending order
        // sort oddArr[] in descending order
        Collections.sort(oddArr);
        Collections.sort(evenArr, Collections.reverseOrder());
        System.out.println(evenArr);
        System.out.println(oddArr);

        int i = 0;
        for (int j = 0; j < arr.length/2; j++) {
            arr[i] = evenArr.get(j);
            i++;
            arr[i] = oddArr.get(j);
            i++;
        }
        if(n%2 != 0){
            arr[n-1] = evenArr.get(evenArr.size()-1);
        }
//        for (int j = 0; j < oddArr.size(); j+=2) {
//            arr[i+=2] = oddArr.get(j);
//        }

    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 1,2,3,4,5,6,7};
        int n = arr.length;
        bitonicGenerator(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/// 13,2 4,15,12,10,5