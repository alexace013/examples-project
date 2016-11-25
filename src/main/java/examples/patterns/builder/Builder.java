package examples.patterns.builder;

public class Builder {

    private Person person;

    public void create() {
        person = new Person();
    }

    public void setName(String name) {
        this.person.setName(name);
    }

    public void setAge(int age) {
        this.person.setAge(age);
    }

    public void setSex(char sex) {
        this.person.setSex(sex);
    }

    public Person getPerson() {
        return this.person;
    }

}
