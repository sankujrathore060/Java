package com.Sankuj.JavaCorePractice.InnerClass.Anonymouse;

public class Driver {
    public static void main(String... args){
        Vehicle car = new Vehicle() {
            @Override
            public void accelarate() {
                System.out.println("accelareate Car");
            }

            @Override
            public void pressBreak() {
                System.out.println("press Break on Car");
            }
        };
        car.accelarate();
        car.pressBreak();
    }
}
