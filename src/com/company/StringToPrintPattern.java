package com.company;

//public class StringToPrintPattern {
//    public static void main(String args[]){
//        String str = "pageDown";
//        int count = 0;
//        while(count<str.length()) {
//            if(count == 0) {
//                for (int i = 0; i < str.length(); i++) {
//                    System.out.print(str.charAt(i));
//                }
//            }
//            count++;
//            System.out.println();
//            for (int j = 0; j < str.length() - count; j++) {
//                System.out.print(str.charAt(j));
//            }
//        }
//    }
//}


public class StringToPrintPattern {
    public static void main(String args[]){
        String str = "pageDown";
        int count = str.length()-1;
        while(count!=0) {
           if(count == str.length()) {
                System.out.print(str.charAt(0));
            }

            for (int j = 0; j < str.length()-count+1; j++) {
                System.out.print(str.charAt(j));
            }
            count--;
            System.out.println();
        }
    }
}

