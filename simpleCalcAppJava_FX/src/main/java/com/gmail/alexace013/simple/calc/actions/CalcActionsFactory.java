package com.gmail.alexace013.simple.calc.actions;

import lombok.Getter;
import lombok.ToString;

import static com.gmail.alexace013.simple.calc.utils.Log4JWrapper.debug;

import static java.lang.String.format;

@Getter
@ToString
public class CalcActionsFactory {

    private static final String LOG_INFO_TEXT = "CREATED %s";
    private static CalcActionsFactory calcActionsFactory = new CalcActionsFactory();

    private CalcSum sum;
    private CalcDifference difference;
    private CalcMultiplication multiplication;
    private CalcDivision division;

    private CalcActionsFactory() {
        createActions();
        debug(format(LOG_INFO_TEXT, getSum().getClass().getSimpleName()));
        debug(format(LOG_INFO_TEXT, getDifference().getClass().getSimpleName()));
        debug(format(LOG_INFO_TEXT, getMultiplication().getClass().getSimpleName()));
        debug(format(LOG_INFO_TEXT, getDivision().getClass().getSimpleName()));
    }

    private void createActions() {
        sum = new CalcSum();
        difference = new CalcDifference();
        multiplication = new CalcMultiplication();
        division = new CalcDivision();
    }

}
