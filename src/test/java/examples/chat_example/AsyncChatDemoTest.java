package examples.chat_example;

import org.junit.Assert;
import org.junit.Test;

import static examples.chat_example.config.ChatConfiguration.COMMAND_EXIT;

public class AsyncChatDemoTest {

    private static final String EXIT_TEXT = COMMAND_EXIT.getConfig().toString();

    @Test
    public void testMethodIsExitPositive() {
        Assert.assertTrue(DemoClient.isExit(EXIT_TEXT));
    }

    @Test
    public void testMethodIsExitNegative() {
        Assert.assertFalse(DemoClient.isExit(EXIT_TEXT.concat(".")));
    }

}
