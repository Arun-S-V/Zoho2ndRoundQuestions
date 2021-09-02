package com.company;

public class Array2NumberSumEqual {
    public static void main(String args[]) {
        int array[] = new int[]{1, 4, 6, 3, 9, 8};
        int num = 17;
        sumCheck(array,num);
    }
    public static void sumCheck(int array[],int num){
        int sum =0;
        outer:for(int i=0;i< array.length;i++){
                for(int j= i+1;j<array.length;j++){
                    sum = array[i]+array[j];
                    if(num == sum){
                        System.out.println("The Matched Elements are "+array[i]+" and "+array[j]+" \nResult = TRUE");
                        break outer;
                    }

                }

        }
        if(num != sum){
            System.out.println("FALSE");
        }
    }
}
