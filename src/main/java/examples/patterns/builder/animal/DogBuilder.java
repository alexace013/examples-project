package examples.patterns.builder.animal;

import lombok.ToString;

import static examples.patterns.builder.animal.Voice.DOG;

@ToString
public class DogBuilder extends AnimalBuilder {

    private static final short DEFAULT_DOG_WEIGHT = 10;

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.DOG.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(DEFAULT_DOG_WEIGHT);
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(DOG.getVoice());
    }
}