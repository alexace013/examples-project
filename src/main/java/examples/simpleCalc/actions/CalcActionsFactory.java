package examples.simpleCalc.actions;

import lombok.Getter;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static java.lang.String.format;

@Getter
@ToString
public class CalcActionsFactory {

    private static final Logger LOG = LogManager.getLogger(CalcActionsFactory.class);
    private static final String LOG_INFO_TEXT = "CREATED %s";

    private CalcSum sum;
    private CalcDifference difference;
    private CalcMultiplication multiplication;
    private CalcDivision division;

    public CalcActionsFactory() {
        createActions();
        LOG.info(format(LOG_INFO_TEXT, getSum().getClass().getSimpleName()));
        LOG.info(format(LOG_INFO_TEXT, getDifference().getClass().getSimpleName()));
        LOG.info(format(LOG_INFO_TEXT, getMultiplication().getClass().getSimpleName()));
        LOG.info(format(LOG_INFO_TEXT, getDivision().getClass().getSimpleName()));
    }

    private void createActions() {
        sum = new CalcSum();
        difference = new CalcDifference();
        multiplication = new CalcMultiplication();
        division = new CalcDivision();
    }

}
