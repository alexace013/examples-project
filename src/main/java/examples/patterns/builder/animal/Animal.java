package examples.patterns.builder.animal;

import examples.patterns.builder.animal.enums.Name;
import examples.patterns.builder.animal.enums.Voice;
import examples.patterns.builder.animal.enums.Weight;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Animal implements IAnimal {

    private String name;
    private String voice;
    private short weight;

    Animal() {
        this.name = Name.DEFAULT.getName();
        this.weight = Weight.ANIMAL.getValue();
        this.voice = Voice.ANIMAL.getVoice();
    }

    @Override
    public String voice() {
        return voice;
    }
}