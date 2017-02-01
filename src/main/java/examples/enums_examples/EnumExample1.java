package examples.enums_examples;

public class EnumExample1 {

    enum MyEnum {

        ENUM1, ENUM2, ENUM3;

        public static MyEnum selectEnum(int enumPosition) {

            switch (enumPosition) {
                case 0:
                    return ENUM1;
                case 1:
                    return ENUM2;
                case 2:
                    return ENUM3;
                default:
                    return null;
            }

        }

    }

}
