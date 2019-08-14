package examples.entities.employee;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class EmployeePredicatesTest {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                employees.add(new Employee(i,
                        Faker.instance().name().firstName(),
                        Faker.instance().name().lastName(),
                        Faker.instance().number().numberBetween(0, 50),
                        Employee.Gender.M.getGender()));
            } else {
                employees.add(new Employee(i,
                        Faker.instance().name().firstName(),
                        Faker.instance().name().lastName(),
                        Faker.instance().number().numberBetween(0, 50),
                        Employee.Gender.F.getGender()));
            }
        }
        System.out.println(employees);
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultFemale()));
    }
}