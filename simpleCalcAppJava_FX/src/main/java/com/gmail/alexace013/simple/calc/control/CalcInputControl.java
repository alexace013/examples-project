package com.gmail.alexace013.simple.calc.control;

import com.gmail.alexace013.simple.calc.actions.CalcMathAction;
import com.gmail.alexace013.simple.calc.exception.CalcInputDataDataException;

public class CalcInputControl {

    private static CalcControl calcControl = new CalcControl();

    public int calcInput(int valueA, String mathAction, int valueB) throws CalcInputDataDataException {
        if (mathAction.equals(CalcMathAction.PLUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MINUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MULT.getMathAction())) {
            return calcControl.multiplication(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.DIV.getMathAction())) {
            return calcControl.division(valueA, valueB);
        } else {
            throw new CalcInputDataDataException(String.format("math action %s is incorrect", mathAction));
        }
    }

    public double calcInput(double valueA, String mathAction, double valueB) throws CalcInputDataDataException {
        if (mathAction.equals(CalcMathAction.PLUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MINUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MULT.getMathAction())) {
            return calcControl.multiplication(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.DIV.getMathAction())) {
            return calcControl.division(valueA, valueB);
        } else {
            throw new CalcInputDataDataException(String.format("math action %s is incorrect", mathAction));
        }
    }

    public double calcInput(double valueA, String mathAction, int valueB) throws CalcInputDataDataException {
        if (mathAction.equals(CalcMathAction.PLUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MINUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MULT.getMathAction())) {
            return calcControl.multiplication(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.DIV.getMathAction())) {
            return calcControl.division(valueA, valueB);
        } else {
            throw new CalcInputDataDataException(String.format("math action %s is incorrect", mathAction));
        }
    }

    public double calcInput(int valueA, String mathAction, double valueB) throws CalcInputDataDataException {
        if (mathAction.equals(CalcMathAction.PLUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MINUS.getMathAction())) {
            return calcControl.sum(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.MULT.getMathAction())) {
            return calcControl.multiplication(valueA, valueB);
        } else if (mathAction.equals(CalcMathAction.DIV.getMathAction())) {
            return calcControl.division(valueA, valueB);
        } else {
            throw new CalcInputDataDataException(String.format("math action %s is incorrect", mathAction));
        }
    }

}
