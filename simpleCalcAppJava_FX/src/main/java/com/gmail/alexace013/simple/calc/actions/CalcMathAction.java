package com.gmail.alexace013.simple.calc.actions;

import lombok.Getter;

@Getter
enum CalcMathAction {

    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/"),
    RESULT(MathActionResult.RESULT.getResult());

    private String mathAction;

    CalcMathAction(String mathAction) {
        this.mathAction = mathAction;
    }

    @Getter
    private enum MathActionResult {

        RESULT("=");

        private String result;

        MathActionResult(String result) {
            this.result = result;
        }

    }

}
