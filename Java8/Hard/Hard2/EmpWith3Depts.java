package Java8.Hard.Hard2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpWith3Depts {

    public static void main(String[] args) {
        List<WorkRecord> records = List.of(
                new WorkRecord("John", "IT"),
                new WorkRecord("John", "Finance"),
                new WorkRecord("John", "HR"),
                new WorkRecord("Alice", "IT"),
                new WorkRecord("Alice", "HR"),
                new WorkRecord("Bob", "IT"),
                new WorkRecord("Bob", "Operational"),
                new WorkRecord("Bob", "HR")
        );
        Map<String, List<WorkRecord>> collect = records.stream()
                .collect(Collectors.groupingBy(
                        WorkRecord::getName
                ));

        List<String> list1 = collect.entrySet().stream()
                .filter(entry -> entry.getValue().size() >= 3)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list1);

    }
}
