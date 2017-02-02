package examples.enums_examples;

public class EnumExample2 {

    enum MyEnum {

        VALUE1("VALUE1"),
        VALUE2("VALUE2"),
        VALUE3(null);

        private String value;

        MyEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

}
