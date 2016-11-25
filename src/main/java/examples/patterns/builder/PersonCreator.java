package examples.patterns.builder;

public class PersonCreator {

    private Builder builder = new Builder();

    public Person createPerson(String name, int age, char sex) {
        builder.create();
        builder.setName(name);
        builder.setAge(age);
        builder.setSex(sex);
        return builder.getPerson();
    }

}
