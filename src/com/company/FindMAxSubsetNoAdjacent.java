package com.company;

public class FindMAxSubsetNoAdjacent {
    public static void main(String args[]){
        int array[] = {2,70,1,3,1};
        int incl = array[0];
        int excl = 0;
        int sum;
        for(int i =1 ;i< array.length;i++) {
            if (incl > excl) {
                sum = incl;
            }
            else {
                sum = excl;
            }
            incl = excl + array[i];
            excl = sum;
        }

        if(incl>excl){
            System.out.println(incl);
        }
        else{
            System.out.println(excl);
        }
    }
}


//class MaximumSum
//{
//    /*Function to return max sum such that no two elements
//      are adjacent */
//    int FindMaxSum(int arr[], int n)
//    {
//        int incl = arr[0];
//        int excl = 0;
//        int excl_new;
//        int i;
//
//        for (i = 1; i < n; i++)
//        {
//            /* current max excluding i */
//            excl_new = (incl > excl) ? incl : excl;
//
//            /* current max including i */
//            incl = excl + arr[i];
//            excl = excl_new;
//        }
//
//        /* return max of incl and excl */
//        return ((incl > excl) ? incl : excl);
//    }
//
//    // Driver program to test above functions
//    public static void main(String[] args)
//    {
//        MaximumSum sum = new MaximumSum();
//        int arr[] = new int[]{2,7,9,3,1};
//        System.out.println(sum.FindMaxSum(arr, arr.length));
//    }
//}