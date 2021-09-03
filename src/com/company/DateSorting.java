package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class DateSorting {
    public static void main(String args[]) throws ParseException {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter number of dates you want to Enter :");
        int i;
        int n = sc.nextInt();
        Date[] dateArray = new Date[n];
        String inputArray[]= new String[n];
        sc.nextLine();

        for(i=0;i<n;i++) {
            inputArray[i]=sc.nextLine();
        }
        SimpleDateFormat sobj = new SimpleDateFormat("dd-MM-yyyy");

        for(i=0;i<n;i++) {
            dateArray[i]=sobj.parse(inputArray[i]);
        }
        Arrays.sort(dateArray);

        for(int k =0;k<n;k++) {
            System.out.println(sobj.format(dateArray[k]));
        }
    }
}