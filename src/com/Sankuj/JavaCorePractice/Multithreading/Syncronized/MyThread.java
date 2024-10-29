package com.Sankuj.JavaCorePractice.Multithreading.Syncronized;

public class MyThread extends Thread{
    private final MyCounter counter;
    public MyThread(MyCounter counter){
        this.counter = counter;
    }
    @Override
    public void run() {

        for(int index = 0; index < 1000; index++) {
            counter.incrementCount();
        }
    }
}
