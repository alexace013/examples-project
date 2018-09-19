package examples.patterns.builder.animal.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Weight {
    ANIMAL((short) 0), CAT((short) 5),
    DOG((short) 10), PIRATE((short) 50),
    TEST((short) -1);

    private short value;
}