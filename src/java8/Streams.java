package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // Find occurrence of each character in a String
        String str = "banana";
        Map<Character, Long> result =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));

        System.out.println(result);

        // Create employee objects using List.of()
        List<Employee> employees = List.of(
                new Employee(1, "Lucky", "IT", 60000, 26),
                new Employee(2, "Ravi", "HR", 50000, 30),
                new Employee(3, "Anil", "IT", 80000, 35),
                new Employee(4, "Lucky", "Finance", 70000, 28),
                new Employee(5, "Suresh", "IT", 40000, 24)
        );

        // Count employees with same name
        Map<String, Long> nameCount =
                employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(nameCount);

        // How do you filter employees whose salary is greater than 60k?

        employees.stream().filter(employee -> employee.getSalary() > 60000).forEach(System.out::println);

        // Get all employee names using map()
        employees.stream().map(Employee::getName).forEach(System.out::println);

        //How to remove duplicate employee names?

        employees.stream().map(Employee::getName).distinct().forEach(System.out::println);

        // Sort employees by salary

        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        // Find highest paid employee

        employees.stream().max(Comparator.comparing( Employee::getSalary)).get();

    }
}
