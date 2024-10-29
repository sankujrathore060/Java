package com.Sankuj.JavaCorePractice.Generic;

public class IntegerCalculation implements ICalculation<Integer>{

    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        return a/b;
    }
}
