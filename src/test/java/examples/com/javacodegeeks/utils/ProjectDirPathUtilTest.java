package examples.com.javacodegeeks.utils;

import org.junit.Assert;
import org.junit.Test;

public class ProjectDirPathUtilTest {

    @Test
    public void positiveTest() {
        Assert.assertNotEquals(ProjectDirPathUtil.getProjectDir(), null);
    }

}
