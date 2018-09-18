package examples.patterns.builder.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Voice {
    ANIMAL("animal"),PIRATE("A-r-r-r!!!"), CAT("meow"), DOG("wow");
    private String voice;
}