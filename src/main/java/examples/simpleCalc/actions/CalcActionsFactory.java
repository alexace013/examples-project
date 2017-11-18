package examples.simpleCalc.actions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.log4j.Logger;

import static java.lang.String.format;

@Getter
@ToString
public class CalcActionsFactory {

    private static final Logger LOG = Logger.getLogger(CalcActionsFactory.class);

    private CalcSum sum;    // sum a + b
    private CalcDifference difference;  // difference a - b
    private CalcMultiplication multiplication;  // multiplication a * b
    private CalcDivision division;  // division a / b

    public CalcActionsFactory() {
        sum = new CalcSum();
        LOG.debug(format("create %s", sum.getClass().getName()));
        difference = new CalcDifference();
        LOG.debug(format("create %s", difference.getClass().getName()));
        multiplication = new CalcMultiplication();
        LOG.debug(format("create %s", multiplication.getClass().getName()));
        division = new CalcDivision();
        LOG.debug(format("create %s", division.getClass().getName()));
    }

}
