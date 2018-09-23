package examples.rest.generator.data;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RestDataGeneratorTest {

    private static final String DEFAULT_USER_NAME_TEXT = "default.username";
    private static final String TEST_USER_NAME_TEXT = "test.username";
    private static final String DEFAULT_PASSWORD_TEXT = "default.password";
    private static final String TEST_PASSWORD_TEXT = "test.password";
    private static final String DEFAULT_HEADER_TEXT = "default.header";
    private static final String TEST_HEADER_TEXT = "test.header";
    private static final String DEFAULT_HEADER_VALUE_TEXT = "default.header.value";
    private static final String TEST_HEADER_VALUE_TEXT = "test.header.value";
    private static final String DEFAULT_PARAM_TEXT = "default.param";
    private static final String TEST_PARAM_TEXT = "test.param";
    private static final String DEFAULT_PARAMETER_VALUE_TEXT = "default.param.value";
    private static final String TEST_PARAMETER_VALUE_TEXT = "test.param.value";

    @Test
    public void _01_testRestDataGeneratorDefaultUsername() {
        SoftAssertions softly = new SoftAssertions();
        RestDataGenerator generator = RestDataGenerator.getInstance();
        softly.assertThat(generator.getDefaultUsername())
                .as("default username is wrong!")
                .isEqualTo(DEFAULT_USER_NAME_TEXT);
        softly.assertAll();
    }

    @Test
    public void _02_testRestDataGeneratorTestUsername() {
        SoftAssertions softly = new SoftAssertions();
        RestDataGenerator generator = RestDataGenerator.getInstance();
        softly.assertThat(generator.getTestUserName())
                .as("test username is wrong!")
                .isEqualTo(TEST_USER_NAME_TEXT);
        softly.assertAll();
    }

}
