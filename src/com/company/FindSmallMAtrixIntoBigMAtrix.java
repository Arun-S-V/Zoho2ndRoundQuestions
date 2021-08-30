package com.company;
//Wrong Answers Don't Follow
public class FindSmallMAtrixIntoBigMAtrix {
    public static void main(String args[]){
        int bigMatrix[][] =  new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int smallMatrix[][] = new int[][]{{1,2},{0,9}};
        int m1 = bigMatrix.length;
        int n1 = bigMatrix[0].length;
        int m2 = smallMatrix.length;
        int n2 = smallMatrix[0].length;
        int count =0;
        boolean flag = false;
        int x = 0,y=0;
        for(int i=0;i<m1;i++){
            for(int j =0;j<n1;j++){
                if(bigMatrix[i][j] == smallMatrix[x][y]){
                    count++;
                    if(y<m2) {
                        y++;
                    }
                    if(y>=m2) {
                        x++;
                        y=0;
                    }
                    if(count==m2*m2){
                        flag = true;
                    }
                }
            }
        }
        if(flag)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
