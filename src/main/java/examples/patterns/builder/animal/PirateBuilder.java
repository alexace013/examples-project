package examples.patterns.builder.animal;

import static examples.patterns.builder.animal.Voice.PIRATE;

import lombok.ToString;

@ToString
public class PirateBuilder extends AnimalBuilder {

    private static final short DEFAULT_PIRATE_WEIGHT = 50;

    @Override
    void createAnimalName() {
        getAnimal().setName(Name.RANDOM.getName());
    }

    @Override
    void createAnimalWeight() {
        getAnimal().setWeight(DEFAULT_PIRATE_WEIGHT);
    }

    @Override
    void createAnimalVoice() {
        getAnimal().setVoice(PIRATE.getVoice());
    }
}