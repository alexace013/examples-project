package examples.patterns.builder.animal;

import lombok.Setter;

@Setter
public class AnimalDriver {
    AnimalBuilder animalBuilder;

    Animal createAnimal() {
        animalBuilder.bornAnimal();
        animalBuilder.createAnimalName();
        animalBuilder.createAnimalWeight();
        animalBuilder.createAnimalVoice();
        return animalBuilder.getAnimal();
    }
}