package examples.simpleCalc.actions;

import lombok.Getter;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static java.lang.String.format;

@Getter
@ToString
public class CalcActionsFactory {

    private static Logger log = LogManager.getLogger(CalcActionsFactory.class);

    private CalcSum sum;
    private CalcDifference difference;
    private CalcMultiplication multiplication;
    private CalcDivision division;

    public CalcActionsFactory() {
        sum = new CalcSum();
        log.info(format("create %s", sum.getClass().getName()));
        difference = new CalcDifference();
        log.info(format("create %s", difference.getClass().getName()));
        multiplication = new CalcMultiplication();
        log.info(format("create %s", multiplication.getClass().getName()));
        division = new CalcDivision();
        log.info(format("create %s", division.getClass().getName()));
    }

}
