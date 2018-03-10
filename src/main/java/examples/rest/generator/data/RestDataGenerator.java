package examples.rest.generator.data;

import utils.annotations.Develop;
import utils.projectPropertiesLoader.Property;
import utils.propertyLoader.PropertyLoaderPrototype;

public final class RestDataGenerator implements IRestData {

    private static final PropertyLoaderPrototype DATA_PROPERTY = new PropertyLoaderPrototype(Property.REST.getProperty());

    private static final String DOT = RestData.DOT.getRestDataParameter();
    private static final String DEFAULT_WORD = RestData.DEFAULT.getRestDataParameter();
    private static final String TEST_WORD = RestData.TEST.getRestDataParameter();
    private static final String VALUE_WORD = RestData.VAL.getRestDataParameter();
    private static final String USERNAME_WORD = RestData.USERNAME.getRestDataParameter();
    private static final String PASSWORD_WORD = RestData.PASSWORD.getRestDataParameter();
    private static final String HEADER_WORD = RestData.HEADER.getRestDataParameter();
    private static final String PARAMETER_WORD = RestData.PARAM.getRestDataParameter();

    private static final String DEFAULT_USER_NAME = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + USERNAME_WORD);
    private static final String TEST_USER_NAME = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + USERNAME_WORD);
    private static final String DEFAULT_PASSWORD = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + PASSWORD_WORD);
    private static final String TEST_PASSWORD = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + PASSWORD_WORD);
    private static final String DEFAULT_HEADER = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + HEADER_WORD);
    private static final String TEST_HEADER = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + HEADER_WORD);
    private static final String DEFAULT_HEADER_VALUE = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + HEADER_WORD + DOT + VALUE_WORD);
    private static final String TEST_HEADER_VALUE = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + HEADER_WORD + DOT + VALUE_WORD);
    private static final String DEFAULT_PARAM = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + PARAMETER_WORD);
    private static final String TEST_PARAM = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + PARAMETER_WORD);
    private static final String DEFAULT_PARAMETER_VALUE = DATA_PROPERTY.getParamAsString(DEFAULT_WORD + DOT + PARAMETER_WORD + DOT + VALUE_WORD);
    private static final String TEST_PARAMETER_VALUE = DATA_PROPERTY.getParamAsString(TEST_WORD + DOT + PARAMETER_WORD + DOT + VALUE_WORD);

    private RestDataGenerator() {
    }

    private static class RestDataGeneratorInstance {
        private static final RestDataGenerator instance = new RestDataGenerator();
    }

    public static RestDataGenerator getInstance() {
        return RestDataGeneratorInstance.instance;
    }

    @Override
    public String getDefaultUsername() {
        return DEFAULT_USER_NAME;
    }

    @Override
    public String getTestUserName() {
        return TEST_USER_NAME;
    }

    @Override
    public String getDefaultPassword() {
        return DEFAULT_PASSWORD;
    }

    @Override
    public String getTestPassword() {
        return TEST_PASSWORD;
    }

    @Override
    public String getDefaultHeader() {
        return DEFAULT_HEADER;
    }

    @Override
    public String getTestHeader() {
        return TEST_HEADER;
    }

    @Override
    public String getDefaultHeaderValue() {
        return DEFAULT_HEADER_VALUE;
    }

    @Override
    public String getTestHeaderValue() {
        return TEST_HEADER_VALUE;
    }

    @Override
    public String getDefaultParameter() {
        return DEFAULT_PARAM;
    }

    @Override
    public String getTestParameter() {
        return TEST_PARAM;
    }

    @Override
    public String getDefaultParameterValue() {
        return DEFAULT_PARAMETER_VALUE;
    }

    @Override
    public String getTestParameterValue() {
        return TEST_PARAMETER_VALUE;
    }

    // TODO complete random values
    @Override
    @Develop(status = "on hold")
    public String getRandomUsername() {
        return null;
    }

    @Override
    @Develop(status = "on hold")
    public String getRandomPassword() {
        return null;
    }

    @Override
    @Develop(status = "on hold")
    public String getRandomHeader() {
        return null;
    }

    @Override
    @Develop(status = "on hold")
    public String getRandomHeaderValue() {
        return null;
    }

    @Override
    @Develop(status = "on hold")
    public String getRandomParameter() {
        return null;
    }

    @Override
    @Develop(status = "on hold")
    public String getRandomParameterValue() {
        return null;
    }

}
