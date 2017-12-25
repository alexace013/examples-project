package examples.jdbc.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private int id;
    private int id_code;
    private String id_passport;
    private String first_name;
    private String last_name;

    public User() {
    }

    public User(int id, int id_code, String id_passport, String first_name, String last_name) {
        this.id = id;
        this.id_code = id_code;
        this.id_passport = id_passport;
        this.first_name = first_name;
        this.last_name = last_name;
    }

}
