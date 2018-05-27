package examples.rest.examples.data.enums;

import examples.rest.examples.data.Data;
import lombok.Getter;

@Getter
public enum ParameterData implements Data {

    PARAMETER_NAME("param"),
    PARAMETER_VALUE(VALUE);

    private String data;

    ParameterData(final String data) {
        this.data = data;
    }

}
