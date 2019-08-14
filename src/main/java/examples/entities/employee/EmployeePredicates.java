package examples.entities.employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

    private static final int MALE_AGE_CONST = 21;
    private static final int FEMALE_AGE_CONST = 18;
    private static final int ZERO_CONST = 0;

    public static Predicate<Employee> isAdultMale() {
        return isEmployeeMaleWithAge(MALE_AGE_CONST, Employee.Gender.M);
    }

    public static Predicate<Employee> isAdultFemale() {
        return isEmployeeMaleWithAge(FEMALE_AGE_CONST, Employee.Gender.F);
    }

    public static Predicate<Employee> isEmployeeMaleWithAge(final int age, final Employee.Gender gender) {
        return employee -> employee.getAge() > age && employee.getGender().equalsIgnoreCase(gender.getGender());
    }

    public static Predicate<Employee> isAgeMoreThan(final int age) {
        return employee -> employee.getAge() > age;
    }

    public static Predicate<Employee> isAgeLessThanZero() {
        return employee -> employee.getAge() < ZERO_CONST;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
}