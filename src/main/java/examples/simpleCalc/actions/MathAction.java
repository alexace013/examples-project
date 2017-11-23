package examples.simpleCalc.actions;

import lombok.Getter;

@Getter
public enum MathAction {

    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/"),
    RESULT(MathActionResult.RESULT.getResult());

    private String mathAction;

    MathAction(String mathAction) {
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
