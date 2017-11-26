package com.gmail.alecace013.simple.calc.tests.console;

import com.gmail.alexace013.simple.calc.control.CalcInputControl;
import com.gmail.alexace013.simple.calc.exception.CalcInputDataDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.info;
import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.error;

public class CalcConsoleTest {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static CalcInputControl calcInputControl;

    public static void runCalc() throws IOException, CalcInputDataDataException {
        calcInputControl = new CalcInputControl();
        info("input value a: ");
//        int a = Integer.parseInt(reader.readLine());
        double a = Double.parseDouble(reader.readLine());
        info("input math action: ");
        String mathAction = reader.readLine();
        info("input value b: ");
//        int b = Integer.parseInt(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        info(String.format("result = %s", calcInputControl.calcInput(a, mathAction, b)));
    }

    public static void main(String[] args) {
        try {
            runCalc();
        } catch (IOException | CalcInputDataDataException e) {
            error(e.getMessage());
        }
    }

}
