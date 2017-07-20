package examples.lambda_examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class LamdaExample01 {

    private static final Logger LOG = Logger.getLogger(LamdaExample01.class);

    public static void dataOutput(final List list) {
        Arrays.asList(list).forEach(e1 -> LOG.info(e1));
    }

}
