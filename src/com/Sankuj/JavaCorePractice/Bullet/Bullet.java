package com.Sankuj.JavaCorePractice.Bullet;

import com.Sankuj.JavaCorePractice.Common.CommanHelper;
import com.Sankuj.JavaCorePractice.Vehicle.Vehicle;

public class Bullet extends Vehicle {
    public Bullet(int Number, String Model, String CompanyName){
        super(Number, Model, CompanyName, CommanHelper.FuelType.Petrol, 2);
    }

    public void generateNoise(){
        System.out.println("Generate Noise");
    }
}
