package examples.patterns.builder.animal;

import examples.patterns.builder.animal.enums.Name;
import examples.patterns.builder.animal.enums.Weight;
import lombok.ToString;

import static examples.patterns.builder.animal.enums.Voice.CAT;

@ToString
public class CatBuilder extends AnimalBuilder {

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.CAT.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(Weight.CAT.getValue());
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(CAT.getVoice());
    }
}