package com.company;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dimension of the Square Matrix : ");
        int N = scan.nextInt();
        int matrix[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        matrixRotate(matrix,N);
        matrixRotate(matrix,N);
        matrixRotate(matrix,N);
        matrixRotate(matrix,N);


        //print the Matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void matrixRotate(int matrix[][],int N){
        //find Transpose of the Matrix
        for(int i =0;i<N;i++){
            for(int j=i;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Rotate the matrix 90 degree clockwise
        for(int i =0;i<N;i++){
            for(int j=0;j<N/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }


    }
}
