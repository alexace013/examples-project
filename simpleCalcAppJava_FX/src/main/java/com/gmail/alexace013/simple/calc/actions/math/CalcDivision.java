package com.gmail.alexace013.simple.calc.actions.math;


import com.gmail.alexace013.simple.calc.actions.CalcAction;
import com.gmail.alexace013.simple.calc.actions.CalcMathAction;
import com.gmail.alexace013.simple.calc.utils.MessageBuilder;

import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.debug;

public class CalcDivision implements CalcAction {

    @Override
    public int mathAct(int valueA, int valueB) {
        final int result = valueA / valueB;
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.DIV.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                result));
        return valueA / valueB;
    }

    @Override
    public double mathAct(double valueA, double valueB) {
        final double result = valueA / valueB;
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.DIV.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                result));
        return result;
    }

    @Override
    public double mathAct(int valueA, double valueB) {
        final double result = valueA / valueB;
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.DIV.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                result));
        return result;
    }

    @Override
    public double mathAct(double valueA, int valueB) {
        final double result = valueA / valueB;
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.DIV.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                result));
        return result;
    }
}
