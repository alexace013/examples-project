package examples.patterns.builder.animal;

import lombok.ToString;

import static examples.patterns.builder.animal.Voice.CAT;

@ToString
public class CatBuilder extends AnimalBuilder {

    private static final short DEFAULT_CAT_WEIGHT = 5;

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.CAT.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(DEFAULT_CAT_WEIGHT);
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(CAT.getVoice());
    }
}