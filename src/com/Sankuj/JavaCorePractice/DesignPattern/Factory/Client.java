package com.Sankuj.JavaCorePractice.DesignPattern.Factory;

import com.Sankuj.JavaCorePractice.DesignPattern.Factory.Vehicle.Vehicle;
import com.Sankuj.JavaCorePractice.DesignPattern.Factory.Vehicle.VehicleFactory;

public class Client {
    public static void main(String... args) throws Exception{
        Vehicle car = VehicleFactory.getVehicle("Bullt");
        car.startVehicle();
    }
}
