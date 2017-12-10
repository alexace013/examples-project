package examples.com.javacodegeeks.utils;

import org.junit.Assert;
import org.junit.Test;
import utils.logger.Log4JWrapper;

public class ProjectDirPathUtilTest {

    @Test
    public void positiveTest() {
        Log4JWrapper.info("POSITIVE TEST");
        Log4JWrapper.debug(String.format("path: %s", ProjectDirPathUtil.getProjectDir()));
        Assert.assertNotEquals(ProjectDirPathUtil.getProjectDir(), null);
    }

    @Test
    public void negativeTest() {
        Log4JWrapper.info("NEGATIVE TEST");
        Log4JWrapper.debug(String.format("path: %s", ProjectDirPathUtil.getProjectDir()));
        // TODO bad practice
        try {
            Assert.assertEquals(ProjectDirPathUtil.getProjectDir(), null);
        } catch (AssertionError e) {
            Log4JWrapper.info("!!! THIS PART OF THE CODE IS NOT GOOD PRACTICE !!!");
            Log4JWrapper.error(e.getMessage());
        }
    }

}
