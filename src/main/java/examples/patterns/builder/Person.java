package examples.patterns.builder;

import examples.patterns.builder.expections.IncorrectAgeException;
import examples.patterns.builder.expections.IncorrectSexException;

public class Person {

    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            try {
                throw new IncorrectAgeException("age must be 0 or bigger)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getSex() {
        if (sex == 'm') {
            return "man";
        } else {
            return "woman";
        }
    }

    public void setSex(char sex) {
        if (sex == 'w') {
            this.sex = sex;
        } else if (sex == 'm') {
            this.sex = sex;
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
