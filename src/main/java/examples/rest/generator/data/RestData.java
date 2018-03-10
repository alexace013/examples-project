package examples.rest.generator.data;

import lombok.Getter;

@Getter
public enum RestData {

    VAL("value"),
    DOT("."),
    UNDERSCORE("_"),
    DEFAULT("default"),
    TEST("test"),
    USERNAME("username"),
    PASSWORD("password"),
    HEADER("header"),
    HEADER_VAL(HEADER.getRestDataParameter()
            + DOT.getRestDataParameter()
            + VAL.getRestDataParameter()),
    PARAM("parameter"),
    PARAM_VAL(PARAM.getRestDataParameter()
            + DOT.getRestDataParameter()
            + VAL.getRestDataParameter());

    private String restDataParameter;

    RestData(final String parameter) {
        this.restDataParameter = parameter;
    }

}
