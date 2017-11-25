package com.gmail.alexace013.simple.calc.actions.factory;

import com.gmail.alexace013.simple.calc.actions.math.CalcDifference;
import com.gmail.alexace013.simple.calc.actions.math.CalcDivision;
import com.gmail.alexace013.simple.calc.actions.math.CalcMultiplication;
import com.gmail.alexace013.simple.calc.actions.math.CalcSum;
import lombok.Getter;
import lombok.ToString;

import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.debug;

import static java.lang.String.format;

@Getter
@ToString
public class CalcActionsFactory {

    private static final String LOG_INFO_TEXT = "CREATED %s";

    private CalcSum sum;
    private CalcDifference difference;
    private CalcMultiplication multiplication;
    private CalcDivision division;

    public CalcActionsFactory() {
        createActions();
    }

    private void createActions() {
        sum = new CalcSum();
        debug(format(LOG_INFO_TEXT, getSum().getClass().getSimpleName()));
        difference = new CalcDifference();
        debug(format(LOG_INFO_TEXT, getDifference().getClass().getSimpleName()));
        multiplication = new CalcMultiplication();
        debug(format(LOG_INFO_TEXT, getMultiplication().getClass().getSimpleName()));
        division = new CalcDivision();
        debug(format(LOG_INFO_TEXT, getDivision().getClass().getSimpleName()));
    }

}
