package com.Sankuj.JavaCorePractice.Multithreading.Syncronized;

public class Main {
    public static void main(String[] args) {
        MyCounter counter = new MyCounter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        counter.printCount();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
