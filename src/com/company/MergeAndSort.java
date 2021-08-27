package com.company;

import java.util.Arrays;

public class MergeAndSort {
    public static void main(String args[]) {
        int array1[] = new int[]{1};
        int array2[] = new int[]{2,2,3};
        int size1 = array1.length;
        int size2 = array2.length;
        int size3 = size1 + size2;
        int array3[] = new int[size3];
        if (size1 != 0 || size2 != 0) {
            int i;
            for (i = 0; i < size1; i++) {
                array3[i] = array1[i];
            }
            for (int j = 0; j < size2; j++, i++) {
                array3[i] = array2[j];
            }
            Arrays.sort(array3);
            int l = 0;
            for (int k = 0; k < size3 - 1; k++) {
                if (array3[k] != array3[k + 1]) {
                    array3[l++] = array3[k];
                }
            }
            array3[l++] = array3[size3 - 1];
            for (int m = 0; m < l; m++) {
                System.out.print(array3[m] + " ");
            }
        }
        else{
            System.out.println("You Entered Some null Values");
        }
    }
}
