package com.Sankuj.JavaCorePractice.Enums;

public enum FuelType {
    Gas(10),
    Petrol(20),
    Electric(30),
    Diesel(40),
    Hydro(50);

    private int value;
    private FuelType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
