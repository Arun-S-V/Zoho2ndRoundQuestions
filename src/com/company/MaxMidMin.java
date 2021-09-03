package com.company;

public class MaxMidMin {
    public static void main(String args[]) {
        int array[] = new int[]{9,6,2,14,5,7,4};
        int n = array.length;
        if (array[0] <= array[1]) {
            System.out.print(array[0] + " ");
        }
        for (int i = 1; i < n - 1; i++) {
            if ((array[i] <= array[i - 1]) && (array[i]<=array[i + 1])) {
                System.out.print(array[i] + " ");
            }
        }
        if (array[n - 1] <= array[n - 2]) {
            System.out.print(array[n - 1] + " ");
        }
    }
}
