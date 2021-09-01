package com.company;

public class Group2or3SumMulof3 {
    public static void main(String args[]){
        int array[] = new int[]{3, 6, 7, 2, 9,21};
        int count =0;
        int sum = 0;
        for(int i=0;i< array.length;i++){
            for(int j =i+1;j< array.length;j++){
                sum = array[i]+array[j];
                System.out.println(sum+" "+array[i]+" "+array[j]);
                if(sum%3 == 0){
                    count++;
                }
            }
        }

        //System.out.println(count);
        for(int i=0;i< array.length;i++){
            for(int j =i+1;j< array.length;j++){
                for(int k =j+1;k<array.length;k++) {
                    sum = array[i] + array[j] + array[k];
                    System.out.println(sum + " " + array[i] + " " + array[j] +" "+array[k]);
                    if (sum % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Output : "+count);
    }
}
