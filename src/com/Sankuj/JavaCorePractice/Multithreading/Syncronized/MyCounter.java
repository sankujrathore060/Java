package com.Sankuj.JavaCorePractice.Multithreading.Syncronized;

public class MyCounter {
    private int count;
    public void incrementCount(){
       //synchronized (this) {
            count++;
      // }
    }
    public void printCount(){
        System.out.println(count);
    }
}
