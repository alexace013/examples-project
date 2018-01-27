package examples.mailValidation;

import examples.patterns.dto.customer.CustomerCreator;
import utils.projectPropertiesLoader.Property;
import utils.propertyLoader.PropertyLoaderPrototype;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailRegexActions {

    private static final String AT_CHAR = "@";
    private static final String TEST_MAIL = "test@mail.com";

    // mvtd - mail validation test demo
    // mvt - mail validation test
    // mr - mail regex
    private static final String[] DOMAIN_ARRAY = {
            "mvtd.com",
            "mvt.com",
            "gmail.com",
            "mail.com",
            "mr.com"
    };

    private static final PropertyLoaderPrototype LOADER_PROTOTYPE = new PropertyLoaderPrototype(
            Property.MAIL_REGEX.getProperty());
    private static final String MAIL_REGEX_STANDARD_TEXT = LOADER_PROTOTYPE
            .getParamAsString("mail.regex.standard");

    public static String getTestGenerateMailAddress() {
        return TEST_MAIL;
    }

    public static String getFailedMailAddress() {
        return getGenerateMailAddress(-1);
    }

    public static String getRandomGenerateMailAddress() {
        int randIndex = (int) (Math.random() * DOMAIN_ARRAY.length);
        return getGenerateMailAddress(randIndex);
    }

    private static String getGenerateMailAddress(final int index) {
        if (index < 0) {
            return "fail.mail.@mail.com.";
        }
        return new StringBuilder()
                .append(new CustomerCreator()
                        .createdCustomers()
                        .get(0)
                        .getFirstName()
                        .toLowerCase())
                .append(AT_CHAR)
                .append(DOMAIN_ARRAY[index])
                .toString();
    }

    public static boolean isMailValid(final String mailAddress) {
        final Pattern validEmailRegexPattern = Pattern
                .compile(MAIL_REGEX_STANDARD_TEXT, Pattern.CASE_INSENSITIVE);
        final Matcher mailMatcher = validEmailRegexPattern.matcher(mailAddress);
        return mailMatcher.find();
    }

}
