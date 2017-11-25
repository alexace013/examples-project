package com.gmail.alexace013.simple.calc.actions;


public class CalcMultiplication implements CalcAction {

    @Override
    public int mathAct(int valueA, int valueB) {
        return valueA * valueB;
    }

    @Override
    public double mathAct(double valueA, double valueB) {
        return valueA * valueB;
    }

    @Override
    public double mathAct(int valueA, double valueB) {
        return valueA * valueB;
    }

    @Override
    public double mathAct(double valueA, int valueB) {
        return valueA * valueB;
    }
}
