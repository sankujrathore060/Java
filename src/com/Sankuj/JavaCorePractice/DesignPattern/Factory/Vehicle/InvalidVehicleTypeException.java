package com.Sankuj.JavaCorePractice.DesignPattern.Factory.Vehicle;

class InvalidVehicleTypeException extends Exception{
    public InvalidVehicleTypeException(String message){
        super(message);
    }
}
