package examples.rest.examples.data.enums;

import examples.rest.examples.data.Data;
import lombok.Getter;

@Getter
public enum UserData implements Data {


    USER_NAME("username"),
    USER_PASS("password");

    private String data;

    UserData(String data) {
        this.data = data;
    }

}
