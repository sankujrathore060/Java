package com.Sankuj.JavaCorePractice.Vehicle;

import com.Sankuj.JavaCorePractice.Common.CommanHelper;
import com.Sankuj.JavaCorePractice.Common.CommanHelper.FuelType;

public class Vehicle {
    private int Number;
    private String Model;
    private String CompanyName;
    private CommanHelper.FuelType FuelType;
    private int FuelCapacity;

    public Vehicle(int Number, String Model, String CompanyName, CommanHelper.FuelType fuelType, int fuelCapacity){
        this.Number = Number;
        this.Model = Model;
        this.CompanyName = CompanyName;
        this.FuelType = fuelType;
        this.FuelCapacity = fuelCapacity;
    }

    public void startVehicle(){
        if(this.FuelCapacity == 0) {
            System.out.println("No fuel");
            return;
        }
        switch (this.FuelType) {
            case CommanHelper.FuelType.Gas:
                this.FuelCapacity--;
                break;

            case CommanHelper.FuelType.Petrol:
                this.FuelCapacity -= 2;
                break;
            default:
                this.FuelCapacity -= 3;
        }
        System.out.println("Vehicle Started");
    }

    public void stopVehicle(){
        System.out.println("Vehicle Stopped");
    }

    public void driveVehicle(int kilometer){
        switch (this.FuelType) {
            case CommanHelper.FuelType.Gas: {
                    if (this.FuelCapacity < kilometer) {
                        System.out.println("No Fuel");
                        return;
                    }
                    this.FuelCapacity -= kilometer;
                break;
            }
            case CommanHelper.FuelType.Petrol: {
                if (this.FuelCapacity < 2 * kilometer) {
                    System.out.println("No Fuel");
                    return;
                }
                this.FuelCapacity -= 2 * kilometer;
                break;
            }
            default: {
                if (this.FuelCapacity < 3 * kilometer) {
                    System.out.println("No Fuel");
                    return;
                }
                this.FuelCapacity -= 3 * kilometer;
            }
        }
    }
}

