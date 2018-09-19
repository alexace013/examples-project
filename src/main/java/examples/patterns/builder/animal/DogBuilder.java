package examples.patterns.builder.animal;

import examples.patterns.builder.animal.enums.Name;
import examples.patterns.builder.animal.enums.Weight;
import lombok.ToString;

import static examples.patterns.builder.animal.enums.Voice.DOG;

@ToString
public class DogBuilder extends AnimalBuilder {

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.DOG.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(Weight.DOG.getValue());
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(DOG.getVoice());
    }
}