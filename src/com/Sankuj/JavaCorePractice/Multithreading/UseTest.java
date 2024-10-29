package com.Sankuj.JavaCorePractice.Multithreading;

public class UseTest {
    public static void main(String... args){
        ThreadDemo t1 = new ThreadDemo("First");
        ThreadRunnable runnable = new ThreadRunnable();
        Thread t2 = new Thread(runnable, "Second");
        t1.start();
        t2.start();
    }
}
