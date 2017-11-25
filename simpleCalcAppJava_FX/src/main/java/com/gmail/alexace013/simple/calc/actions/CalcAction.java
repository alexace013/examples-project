package com.gmail.alexace013.simple.calc.actions;

interface CalcAction {

    int mathAct(final int valueA, final int valueB);
    double mathAct(final double valueA, final double valueB);
    double mathAct(final int valueA, final double valueB);
    double mathAct(final double valueA, final int valueB);

}
