package examples.patterns.builder.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Animal implements IAnimal {

    private static final short DEFAULT_WEIGHT = 0;

    private String name;
    private String voice;
    private short weight;

    Animal() {
        this.name = Name.DEFAULT.getName();
        this.weight = DEFAULT_WEIGHT;
        this.voice = Voice.ANIMAL.getVoice();
    }

    @Override
    public String voice() {
        return voice;
    }
}