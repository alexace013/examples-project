package examples.patterns.builder.animal;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AnimalApp {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        AnimalDriver animalDriver = new AnimalDriver();
        animalDriver.setAnimalBuilder(new CatBuilder());
        animals.add(animalDriver.createAnimal());
        animalDriver.setAnimalBuilder(new DogBuilder());
        animals.add(animalDriver.createAnimal());
        animalDriver.setAnimalBuilder(new PirateBuilder());
        animals.add(animalDriver.createAnimal());
        animals.stream()
                .map(animal -> String.format("%s WHERE voice <%s>",
                        animal.toString(), animal.voice()))
                .forEach(log::info);
    }
}