package examples.entities.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String gender;

    @Getter
    @ToString
    @AllArgsConstructor
    enum Gender {
        M("M"),
        F("F");

        private String gender;
    }
}