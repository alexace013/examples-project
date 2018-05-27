package examples.rest.examples.data.enums;

import examples.rest.examples.data.Data;
import lombok.Getter;

@Getter
public enum NumbersData implements Data {

    NUMBER0("0"),
    NUMBER1("1"),
    NUMBER2("2"),
    NUMBER3("3"),
    NUMBER4("4"),
    NUMBER5("5"),
    NUMBER6("6"),
    NUMBER7("7"),
    NUMBER8("8"),
    NUMBER9("9");

    private String data;

    NumbersData(final String data) {
        this.data = data;
    }

}
