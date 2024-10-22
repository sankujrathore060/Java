package com.Sankuj.JavaCorePractice.Activa;

import com.Sankuj.JavaCorePractice.Common.CommanHelper;
import com.Sankuj.JavaCorePractice.Vehicle.Vehicle;

public class Activa extends Vehicle {
    public Activa(int Number, String Model, String CompanyName){
        super(Number, Model, CompanyName, CommanHelper.FuelType.Petrol, 3);
    }

    public void OpenDicky(){
        System.out.println("Open Dicky");
    }

    public void CloseDicky(){
        System.out.println("Close Dicky");
    }
}
