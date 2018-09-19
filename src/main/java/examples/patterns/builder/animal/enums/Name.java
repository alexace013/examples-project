package examples.patterns.builder.animal.enums;

import static examples.patterns.builder.animal.enums.Name.NameParam.NAME;
import static examples.patterns.builder.animal.enums.Name.NameParam.UNDERSCORE;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.test.Test;

@Getter
@AllArgsConstructor
public enum Name {

    DEFAULT(Voice.ANIMAL.getVoice() +
            UNDERSCORE.getParam() +
            NAME.getParam()),
    CAT("Fix"),
    DOG("Bug"),
    TEST(Test.TEST.getTestValue() +
            UNDERSCORE.getParam() +
            NAME.getParam()),
    RANDOM(new Faker().name().firstName());

    private String name;

    public enum NameParam {
        UNDERSCORE("_"),
        NAME("name");
        private String param;

        NameParam(final String param) {
            this.param = param;
        }

        String getParam() {
            return param;
        }
    }
}