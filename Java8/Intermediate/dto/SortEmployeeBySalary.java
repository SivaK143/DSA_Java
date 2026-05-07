package Java8.Intermediate.dto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101,"singh",50000),
                new Employee(102,"Alice",70000),
                new Employee(103,"John",45000),
                new Employee(104,"mukesh",60000)
        );

        //ascending order
      List<Employee> list =  employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(list);

        //descending order
       List<Employee> list2 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(list2);
    }
}
