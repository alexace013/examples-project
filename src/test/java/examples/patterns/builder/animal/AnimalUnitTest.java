package examples.patterns.builder.animal;

import examples.patterns.builder.animal.enums.Name;
import examples.patterns.builder.animal.enums.Voice;
import examples.patterns.builder.animal.enums.Weight;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@Log4j2
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalUnitTest {

    private AnimalDriver testAnimal;

    @Before
    public void setUp() {
        testAnimal = new AnimalDriver();
    }

    @Test
    public void _01_testAnimalBuilder() {
        checkBuilder(new AnimalBuilder() {
            @Override
            void createAnimalName() {
                getAnimal().setName(Name.TEST.getName());
            }

            @Override
            void createAnimalWeight() {
                getAnimal().setWeight(Weight.TEST.getValue());
            }

            @Override
            void createAnimalVoice() {
                getAnimal().setVoice(Voice.ANIMAL.getVoice());
            }
        }, Name.TEST.getName(), Voice.ANIMAL.getVoice(), Weight.TEST.getValue());
    }

    @Test
    public void _02_testCatBuilder() {
        checkBuilder(new CatBuilder(),
                Name.CAT.getName(),
                Voice.CAT.getVoice(),
                Weight.CAT.getValue());
    }

    @Test
    public void _03_testDogBuilder() {
        checkBuilder(new DogBuilder(),
                Name.DOG.getName(),
                Voice.DOG.getVoice(),
                Weight.DOG.getValue());
    }

    @Test
    public void _04_testPirateBuilder() {
        checkBuilder(new PirateBuilder(),
                Name.RANDOM.getName(),
                Voice.PIRATE.getVoice(),
                Weight.PIRATE.getValue());
    }

    private void checkBuilder(final AnimalBuilder builder,
                              final String name,
                              final String voice,
                              final short weight) {
        testAnimal.setAnimalBuilder(builder);
        log.info(String.format("<%s>", testAnimal.createAnimal().toString()));
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(testAnimal.createAnimal().getName())
                .isEqualTo(name);
        softly.assertThat(testAnimal.createAnimal().getVoice())
                .isEqualTo(voice);
        softly.assertThat(testAnimal.createAnimal().getWeight())
                .isEqualTo(weight);
        softly.assertAll();
    }
}