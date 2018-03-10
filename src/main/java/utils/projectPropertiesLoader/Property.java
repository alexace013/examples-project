package utils.projectPropertiesLoader;

import org.jetbrains.annotations.Contract;

public enum Property {

    CUSTOMER("/patterns/customer.properties"),
    NAME("/txt/name.properties"),
    REST("/rest/data.properties");

    private String property;

    Property(final String property) {
        this.property = property;
    }

    @Contract(pure = true)
    public String getProperty() {
        return property;
    }

}
