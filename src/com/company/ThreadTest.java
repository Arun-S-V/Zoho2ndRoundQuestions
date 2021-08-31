package com.company;

public class ThreadTest extends Thread{
    public void Thread1(){
        synchronized (this){
            System.out.println("Thread1");
        }
    }
    public void Thread2(){
        //System.out.println("Thread2dsn o");
        synchronized (this){
            System.out.println("Thread2");
        }
    }
    public static void main(String args[]){
        try {
            ThreadTest obj1 = new ThreadTest();
            Thread t1 = new Thread() {
                public void run() {
                    obj1.Thread1();
                }
            };
            ThreadTest obj2 = new ThreadTest();
            Thread t2 = new Thread() {
                public void run() {
                    obj2.Thread2();
                }
            };
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

































