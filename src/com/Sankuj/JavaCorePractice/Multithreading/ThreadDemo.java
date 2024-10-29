package com.Sankuj.JavaCorePractice.Multithreading;

public class ThreadDemo extends Thread {
    public ThreadDemo(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int index = 0; index < 10; index++){
            try{
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted Exception");
            }
            System.out.println(Thread.currentThread().getName() + "-" + index);
        }
    }
}
