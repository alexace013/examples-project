package com.gmail.alexace013.simple.calc.actions.math;

import com.gmail.alexace013.simple.calc.actions.CalcAction;
import com.gmail.alexace013.simple.calc.actions.CalcMathAction;
import com.gmail.alexace013.simple.calc.utils.MessageBuilder;

import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.debug;

public class CalcDifference implements CalcAction {

    @Override
    public int mathAct(int valueA, int valueB) {
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.MINUS.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                (valueA + valueB)));
        return valueA - valueB;
    }

    @Override
    public double mathAct(double valueA, double valueB) {
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.MINUS.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                (valueA + valueB)));
        return valueA - valueB;
    }

    @Override
    public double mathAct(int valueA, double valueB) {
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.MINUS.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                (valueA + valueB)));
        return valueA - valueB;
    }

    @Override
    public double mathAct(double valueA, int valueB) {
        debug(MessageBuilder.getDebugMessage(valueA,
                CalcMathAction.MINUS.getMathAction(),
                valueB,
                CalcMathAction.RESULT.getMathAction(),
                (valueA + valueB)));
        return valueA - valueB;
    }
}
