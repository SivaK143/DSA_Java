package Java8.Intermediate.dto.Employee1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptHighAvgSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John","HR",47000),
                new Employee(2,"mike","IT",77000),
                new Employee(3,"vikram","Finance",45000),
                new Employee(4,"singh","HR",62000),
                new Employee(6,"pal","HR",49000),
                new Employee(7,"joy","Operations",59000),
                new Employee(8,"kim","IT",69000),
                new Employee(9,"jim","IT",79000)
        );

       Map<String,Double> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map);
       Map.Entry<String, Double> res = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(res);
    }
}
