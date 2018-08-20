package examples.json_examples.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Setter;

@Setter
public class SimpleBean02 {

    public int id;
    private String name;

    @JsonGetter("name")
    public String getName() {
        return name;
    }
}
