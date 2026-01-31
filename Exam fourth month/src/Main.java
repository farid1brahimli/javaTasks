import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TASK21
//        List<Integer> nums = List.of(3, 10, 15,20,7,8);
//        List<Integer> sortedNums = nums.stream()
//                .filter(n -> (n % 2) == 1)
//                .map(n -> n*3).sorted(Comparator.reverseOrder()).toList();
//
//        System.out.println(sortedNums);

//TASK22
//        List<String> names = List.of("Ali", "Aysel", "Murad", "Nigar", "Amin");
//        Map<Character, Long> sortedNames = names.stream()
//                .collect(Collectors.groupingBy(name -> name.charAt(0),
//                        Collectors.counting()));
//        System.out.println(sortedNames);

//TASK23
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        List<Callable<Integer>> task = new ArrayList<>();
//        for (int i = 1; i <= 5; i++) {
//            int num = i;
//            task.add(() -> num * num);
//        }

//        //TASK24
//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        List<Integer> result = list.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n*2).toList();
//
//        System.out.println(result);

        //TASK25 null
    }
}