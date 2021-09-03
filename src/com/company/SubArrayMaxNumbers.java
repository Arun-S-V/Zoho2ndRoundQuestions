package com.company;

public class SubArrayMaxNumbers {
    public static void main(String args[]) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8000000, 9, 10};
        int k = 6;
        int n = array.length;
        int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = array[i];
            for (j = 1; j < k; j++) {
                if (array[i + j] > max) {
                    max = array[i + j];
                }
            }
            System.out.println(max + "\t");
        }
    }
}
