package com.Sankuj.JavaCorePractice.Multithreading;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for(int index = 0; index < 10; index++){
            try{
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted Exception");
            }
            System.out.println("Runnable" + Thread.currentThread().getName() + "-" + index);
        }
    }
}
