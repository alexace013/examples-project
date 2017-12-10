package examples.copyFileExample;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.logger.Log4JWrapper;

import java.io.File;
import java.io.IOException;

public class CopyFileExamplesTest {

    private static CopyFileExamples copyFileExamples;
    private static File originalFile;

    @BeforeClass
    public static void setUp() {
        copyFileExamples = new CopyFileExamples();
        originalFile = new File(CopyFileExamples.getProjectDir() +
                CopyFileExamples.getOriginalDir() +
                CopyFileExamples.getOriginalFileName());
    }

    @Test
    public void ioApiCopyExampleTest() {
        try {
            Assert.assertTrue(copyFileExamples.ioApiCopyExample(originalFile));
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

    @Test
    public void nio2ApiCopyExampleTest() {
        try {
            Assert.assertTrue(copyFileExamples.nio2ApiCopyExample(originalFile));
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

    @Test
    public void commonsIoApiCopyExampleTest() {
        try {
            Assert.assertTrue(copyFileExamples.commonsIoApiCopyExample(originalFile));
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

}
