package com.Sankuj.JavaCorePractice.Generic;

import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        KeyValuePair<Integer, String> pair = new KeyValuePair<>(1, "Sankuj Rathore");
        ArrayList<String> list = new ArrayList<>();
        list.add("TEST");
        list.add("TEST2");
        WildCard.PrintList(list);
        ICalculation<Integer> calculation = new IntegerCalculation();
        System.out.println(calculation.sum(10, 20));
        System.out.println(calculation.sub(20, 10));
        System.out.println(calculation.mul(20, 10));
        System.out.println(calculation.div(20, 10));
        ICalculation<Float> calculation2 = new FloatCalculation();
        System.out.println(calculation2.sum(10f, 20f));
        System.out.println(calculation2.sub(20f, 10f));
        System.out.println(calculation2.mul(20f, 10f));
        System.out.println(calculation2.div(20f, 10f));
    }
}
