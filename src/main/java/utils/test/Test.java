package utils.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Test {
    TEST("test");
    private String testValue;
}