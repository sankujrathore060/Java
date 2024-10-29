package com.Sankuj.JavaCorePractice.DesignPattern.Singleton;

public class Vehicle {
    public static void getVehicle(){
        LoggerThread thread =new LoggerThread("Vehicle");
        thread.start();
    }
}
