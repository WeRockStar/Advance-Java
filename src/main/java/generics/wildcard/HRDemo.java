package generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class HRDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Martin"),
                new Employee("Robert"));

        List<Salaried> salarieds = Arrays.asList(
                new Salaried("Kyle"),
                new Salaried("Stan"),
                new Salaried("Kenny"));

//        System.out.println(employees);
//        System.out.println(salarieds);

        // HR.printEmpName(employees);

//        HR.printEmpAndSubclassNames(salarieds);

        HR.printAllFiltered(employees, e -> e.toString().length() % 2 == 0);
    }
}
