package examples.dtoExamples.customer;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class CustomerDTO implements Serializable {

    private final long serialVersionUid = UUID.randomUUID().getMostSignificantBits();
    private String firstName;
    private String lasName;
    private String company;

}
