package com.Sankuj.JavaCorePractice.Enums;
import java.util.*;
public class Car {
    public List<com.Sankuj.JavaCorePractice.Enums.FuelType> getFuelType() {
        return FuelType;
    }

    public void setFuelType(List<com.Sankuj.JavaCorePractice.Enums.FuelType> fuelType) {
        FuelType = fuelType;
    }

    private List<FuelType> FuelType;
    public Car(List<FuelType> fuelType){
        this.FuelType = fuelType;
    }

    public static  void main(String... args){

        List<FuelType> fuelTypes = new ArrayList<>();
        fuelTypes.add(com.Sankuj.JavaCorePractice.Enums.FuelType.Gas);
        fuelTypes.add(com.Sankuj.JavaCorePractice.Enums.FuelType.Petrol);
        fuelTypes.add(com.Sankuj.JavaCorePractice.Enums.FuelType.Diesel);
        Car car = new Car(fuelTypes);
        System.out.println("Fuel Types:-");
        for(com.Sankuj.JavaCorePractice.Enums.FuelType fuel : car.FuelType){
            System.out.println(fuel.name() + fuel.ordinal() + " ");
        }
        com.Sankuj.JavaCorePractice.Enums.FuelType fuelType = com.Sankuj.JavaCorePractice.Enums.FuelType.valueOf("Hydro");
        System.out.println(fuelType.name());
        System.out.println(fuelType.getValue());
    }
}
