import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //TASK19
//        List<String> words = List.of("One", "Two", "Three", "Four");
//        List<Integer> count = words.stream().map(String::length).toList();
//        System.out.println(count);
        //TASK18
//        List<Integer> numbers = List.of(1,2,3);
//        List<Integer> result = numbers.stream().map(n -> n * 2).toList();
//        System.out.println(result);
        //TASK17
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> result = numbers.stream().filter(n -> n > 5).toList();
//        System.out.println(result);
        //TASK16
//        List<String> marks = List.of("A", "B", "C");
//        marks.stream().forEach(System.out::println);
        //TASK14
//        List<Employee> employees = List.of(
//                new Employee("Farid", 2200),
//                new Employee("Elmar", 1800),
//                new Employee("Ilvin", 2300),
//                new Employee ("Ramin", 3000)
//        );
//        List<Employee> result = employees.stream()
//                .sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
//        System.out.println(result);
        //TASK15
//        double average = employees.stream()
//                .collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(average);
        //TASK13
//        List<List<String>> list = List.of(
//                List.of("A", "B"),
//                List.of("C", "D"),
//                List.of("E", "F")
//        );
//        List<String> result = list.stream()
//                .flatMap(List::stream)
//                .toList();
//        System.out.println(result);
        //TASK12
//        List<Integer> numbers = List.of(1,2,3,2,4,5,6,3,3,7,1);
//        Set<Integer> seen = new HashSet<>();
//        Set<Integer> duplicates = numbers.stream()
//                .filter(n -> !seen.add(n))
//                .collect(Collectors.toSet());
//        System.out.println("Duplicates: " + duplicates);
        //TASK11
//        List<Integer> numbers = List.of(1,2,3,4,5);
//        Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
//        System.out.println(result);
        //TASK10
//        List<String> words = List.of("a","bb","ccc","dd");
//        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));
//        System.out.println(map);
        //TASK9
//        List<Integer> numbers = List.of(10,50,30);
//        int maxElem = numbers.stream().max(Integer::compareTo).get();
//        System.out.println(maxElem);
        //TASK8
//        List<String> fruits = List.of("apple", "banana", "kiwi", "lemon");
//        Map<String, Integer> result = fruits.stream()
//                .collect(Collectors.toMap(w -> w, String::length));
//        System.out.println(result);
        //TASK7
//        List<Integer> numbers = List.of(1,2,3,4,5,6);
//        int evenNumbersSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
//        System.out.println(evenNumbersSum);
        //TASK6
//        List<Integer> list = List.of(3,1,4,2);
//        List<Integer> result = list.stream().map(n -> n*n).sorted().toList();
//        System.out.println(result);
        //TASK5
//        List<String> names = List.of("Farid", "Ramin", "Elmar", "Marif");
//        String aNames = names.stream().filter(n-> n.startsWith("A")).findFirst().orElse(null);
//        System.out.println(aNames);
        //TASK4****************************************************************************
//        List<String> data = Arrays.asList("salam", null, "Sagol", null, "bayraa");
//        List<String> result = data.stream().filter(Objects::nonNull).toList();
//        System.out.println(result);
        //TASK3
//        List<Integer> numbers = List.of(5,10,15,20);
//        Long count = numbers.stream().filter(n -> n>10).count();
//        System.out.println(count);
        //TASK2
//        List<String> names = List.of("java", "stream", "api");
//        List<String> result = names.stream().map(String::toUpperCase).toList();
//        System.out.println(result);
        //TASK1
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> result = numbers.stream()
//               .filter(n -> n % 2 == 0)
//               .toList();
//        System.out.println(result);
    }
}