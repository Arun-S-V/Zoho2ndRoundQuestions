package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FackBookFriend {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,i,t,j,m=0,flag=0;
//        char a[][] = new char[100][100];
//        char b[][] = new char[100][100];
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        n = scan.nextInt();
        for(i =0;i<n;i++) {
            a.add(i,scan.next());
            t = scan.nextInt();
            if(t != 0){
                b.add(m,scan.next());
                m++;
                t--;
            }
        }
        for(j =0;j<m;j++){
            flag = 0;
            for(i=0;i<n;i++){
                if(a.get(i).equals(b.get(i)))
                    flag = 1;
            }
            if(flag != 1){
                System.out.println(b.get(j));
            }
        }
    }
}
