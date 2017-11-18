package examples.simpleCalc.actions;

import examples.simpleCalc.CalcAction;

public class CalcMultiplication implements CalcAction {

    @Override
    public int mathAct(int valueA, int valueB) {
        return valueA * valueB;
    }

    @Override
    public double mathAct(double valueA, double valueB) {
        return valueA * valueB;
    }
}
