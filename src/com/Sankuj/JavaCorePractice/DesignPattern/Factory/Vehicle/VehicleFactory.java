package com.Sankuj.JavaCorePractice.DesignPattern.Factory.Vehicle;
public class VehicleFactory {
    public static Vehicle getVehicle(String vehicle) throws InvalidVehicleTypeException{
        switch (vehicle){
            case "Car": return new Car();
            case "Bullet":return new Bullet();
        }
        throw new InvalidVehicleTypeException("Invalid Vehicle Type Exception");
    }
}
