package examples.rest.property;

import lombok.Getter;

@Getter
public enum RestProperty {

    DATA("/rest/data.properties");

    private String property;

    RestProperty(final String property) {
        this.property = property;
    }

}
