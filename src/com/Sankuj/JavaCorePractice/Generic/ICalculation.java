package com.Sankuj.JavaCorePractice.Generic;

public interface ICalculation<T extends Number> {
    T sum(T a, T b);
    T mul(T a, T b);
    T sub(T a, T b);
    T div(T a, T b);
}
