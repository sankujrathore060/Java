package com.Sankuj.JavaCorePractice.DesignPattern.Singleton;

public class User {
    public static void main(String... args){
        LoggerThread thread =new LoggerThread("User");
        thread.start();
        LoggerThread thread1 =new LoggerThread("Vehicle");
        thread1.start();
    }
}


