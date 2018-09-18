package examples.patterns.builder.animal;

import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@ToString
public abstract class AnimalBuilder {
    private Animal animal;

    void bornAnimal() {
        animal = new Animal();
    }

    abstract void createAnimalName();

    abstract void createAnimalWeight();

    abstract void createAnimalVoice();

    @NotNull
    Animal getAnimal() {
        return animal;
    }
}