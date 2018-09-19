package examples.patterns.builder.animal;

import static examples.patterns.builder.animal.enums.Voice.PIRATE;

import examples.patterns.builder.animal.enums.Name;
import examples.patterns.builder.animal.enums.Weight;
import lombok.ToString;

@ToString
public class PirateBuilder extends AnimalBuilder {

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.RANDOM.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(Weight.PIRATE.getValue());
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(PIRATE.getVoice());
    }
}