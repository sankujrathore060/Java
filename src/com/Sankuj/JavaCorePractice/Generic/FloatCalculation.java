package com.Sankuj.JavaCorePractice.Generic;

public class FloatCalculation implements ICalculation<Float>{
    @Override
    public Float sum(Float a, Float b) {
        return a  + b;
    }

    @Override
    public Float mul(Float a, Float b) {
        return a * b;
    }

    @Override
    public Float sub(Float a, Float b) {
        return a - b;
    }

    @Override
    public Float div(Float a, Float b) {
        return a / b;
    }
}
