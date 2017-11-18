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

    private CalcSum sum;
    private CalcDifference difference;
    private CalcMultiplication multiplication;
    private CalcDivision division;

    public CalcActionsFactory() {
        sum = new CalcSum();
        LOG.info(format("create %s", sum.getClass().getName()));
        difference = new CalcDifference();
        LOG.info(format("create %s", difference.getClass().getName()));
        multiplication = new CalcMultiplication();
        LOG.info(format("create %s", multiplication.getClass().getName()));
        division = new CalcDivision();
        LOG.info(format("create %s", division.getClass().getName()));
    }

}
