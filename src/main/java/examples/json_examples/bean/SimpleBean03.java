package examples.json_examples.bean;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "name"})
public class SimpleBean03 {

    public int id;
    public String name;
}
