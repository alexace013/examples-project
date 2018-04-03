package examples.mailValidation;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import utils.logger.Log4JWrapper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MailValidationTests {

    @Rule
    public TestName name = new TestName();

    private String mail;

    @Test
    public void positiveMailValidationTest() {
        Log4JWrapper.debug(String.format("METHOD: %s \nstart--", name.getMethodName()));
        mail = MailRegexActions.getRandomGenerateMailAddress();
        Log4JWrapper.info(String.format("mail is: %s", mail));
        Assert.assertTrue(MailRegexActions.isMailValid(mail));
        Log4JWrapper.debug(String.format("METHOD: %s \n--end", name.getMethodName()));
    }

    @Test
    public void negativeMailValidationTest() {
        Log4JWrapper.debug(String.format("METHOD: %s \nstart--", name.getMethodName()));
        mail = MailRegexActions.getFailedMailAddress();
        Log4JWrapper.info(String.format("mail is: %s", mail));
        Assert.assertFalse(MailRegexActions.isMailValid(mail));
        Log4JWrapper.debug(String.format("METHOD: %s \n--end", name.getMethodName()));
    }

    @Test
    public void testValidation() {
        Log4JWrapper.debug(String.format("METHOD: %s \nstart--", name.getMethodName()));
        mail = MailRegexActions.getTestGenerateMailAddress();
        Log4JWrapper.debug(String.format("mail is: %s", mail));
        Assert.assertEquals("mails are wrongs!!!", mail, "test@mail.com");
        Log4JWrapper.debug(String.format("METHOD: %s \n--end", name.getMethodName()));
    }

}
