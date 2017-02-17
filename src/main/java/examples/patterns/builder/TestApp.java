package examples.patterns.builder;

public class TestApp {

    public static void main(String[] args) {

        PersonCreator personCreator = new PersonCreator();
        Person person1 = personCreator.createPerson("Name1", 0, 'm');
        Person person2 = personCreator.createPerson("Name2", 1, 'w');
        System.out.println(String.format("%s= %s %s", person1.getName(), person1.getAge(), person1.getSex()));
        System.out.println(String.format("%s= %s %s", person2.getName(), person2.getAge(), person2.getSex()));

    }

}
