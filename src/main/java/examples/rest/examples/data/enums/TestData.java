package examples.rest.examples.data.enums;

import examples.rest.examples.data.Data;
import lombok.Getter;

@Getter
public enum TestData implements Data {

    TEST("test");

    private String data;

    TestData(final String data) {
        this.data = data;
    }

}
