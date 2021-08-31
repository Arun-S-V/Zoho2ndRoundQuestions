package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PetrolBunk {
    public static  void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sum =0;
        int dis =0;
        System.out.println("Enter Remaining Petrol in Car in Litres :");
        int remaining = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Petrol Bunk Names : ");
        String bunk = scan.nextLine();
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(bunk.split(" ")));
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        //System.out.println(list1);
        System.out.println("Enter the distance : ");
        for(int i =0;i<list1.size();i++){
            list2.add(scan.nextInt());
            dis = dis+list2.get(i);
        }
        //System.out.println(list2);
        System.out.println("Enter the petrol Tank Capacity : ");
        for(int i=0;i< list2.size();i++){
            list3.add(scan.nextInt());
            sum = sum +list3.get(i);
        }
        sum =sum+remaining;
        sum = sum-dis;
        //System.out.println(sum);
        if(sum>=0)
            System.out.println("Success!!! Remaining Petrol is : "+sum+" Litres");
        else
            System.out.println("Not Enough Petrol You have");
    }
}
