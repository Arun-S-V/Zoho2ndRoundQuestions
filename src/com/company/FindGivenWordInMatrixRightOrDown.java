package com.company;

public class FindGivenWordInMatrixRightOrDown {
    public static void main(String args[]){
        char matrix[][] = new char[][]{ {'a','z','o','l'},
                                        {'n','x','h','o'},
                                        {'v','y','i','v'},
                                        {'o','r','s','e'}
                                      };
        String Dictionary[] =new String[]{"van", "zoho", "love", "are", "is"};
        int k =0;
        int s =0;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j< matrix[0].length;j++)
            if(matrix[i][j] == Dictionary[k].charAt(s)){
                if(matrix[i][j+1] == Dictionary[k].charAt(s+1) || matrix[i+1][j+1] == Dictionary[k].charAt(s+1)){

                }
            }
        }
    }
}
