package examples.rest.examples.data.enums;

import examples.rest.examples.data.Data;
import lombok.Getter;

@Getter
public enum HeaderData implements Data {

    HEADER_NAME("header"),
    HEADER_VALUE(VALUE);

    private String data;

    HeaderData(final String data) {
        this.data = data;
    }

}
