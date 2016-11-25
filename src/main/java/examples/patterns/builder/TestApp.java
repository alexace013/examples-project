package examples.patterns.builder;

public class TestApp {

    public static void main(String[] args) {

        PersonCreator personCreator = new PersonCreator();
        Person person1 = personCreator.createPerson("Test1", 1, 'm');
        Person person2 = personCreator.createPerson("Test2", 2, 'w');
        System.out.println(String.format("%s= %s %s \n", person1, person1.getName(), person1.getAge()));
        System.out.println(String.format("%s= %s %s \n", person2, person2.getName(), person2.getAge()));

    }

}
