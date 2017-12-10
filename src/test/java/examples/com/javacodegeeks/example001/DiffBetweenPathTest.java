package examples.com.javacodegeeks.example001;

import examples.com.javacodegeeks.examle001.DiffBetweenPath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.logger.Log4JWrapper;

import java.io.IOException;

public class DiffBetweenPathTest {

    private static DiffBetweenPath diffBetweenPath;

    @BeforeClass
    public static void setUp() {
        diffBetweenPath = new DiffBetweenPath();
        diffBetweenPath.createFile();
        Log4JWrapper.debug(diffBetweenPath.getInfoFileText());
    }

    @Test
    public void getPathTest() {
        Log4JWrapper.info(diffBetweenPath.getPath());
    }

    @Test
    public void getNameTest() {
        Log4JWrapper.info(diffBetweenPath.getName());
    }

    @Test
    public void getAbsolutePathTest() {
        Log4JWrapper.info(diffBetweenPath.getAbsolutePath());
    }

    @Test
    public void getCanonicalPathTest() {
        try {
            Log4JWrapper.info(diffBetweenPath.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isFileTest() {
        Assert.assertTrue(diffBetweenPath.isFile());
    }

}
