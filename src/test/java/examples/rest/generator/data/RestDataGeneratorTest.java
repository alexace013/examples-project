package examples.rest.generator.data;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RestDataGeneratorTest {

    private static final String DEFAULT_USER_NAME_TEXT = "default_username";
    private static final String TEST_USER_NAME_TEXT = "test_username";
    private static final String DEFAULT_PASSWORD_TEXT = "default_password";
    private static final String TEST_PASSWORD_TEXT = "test_password";
    private static final String DEFAULT_HEADER_TEXT = "default_header";
    private static final String TEST_HEADER_TEXT = "test_header";
    private static final String DEFAULT_HEADER_VALUE_TEXT = "default_header_value";
    private static final String TEST_HEADER_VALUE_TEXT = "test_header_value";
    private static final String DEFAULT_PARAM_TEXT = "default_param";
    private static final String TEST_PARAM_TEXT = "test_param";
    private static final String DEFAULT_PARAMETER_VALUE_TEXT = "default_param_value";
    private static final String TEST_PARAMETER_VALUE_TEXT = "test_param_value";

    @Test
    public void testRestDataGenerator() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(RestDataGenerator.getInstance()
                .getDefaultUsername())
                .as("default header is wrong!")
                .isEqualTo(DEFAULT_USER_NAME_TEXT);
        softly.assertAll();

    }

}
