package java_advanced_01.day20_0822.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");

        // 1. 이름 중 "A"로 시작하는 이름을 수집하여 출력하시오.
        names.stream().filter(name -> name.startsWith("A")).toList().forEach(name -> System.out.println());
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");

        // 2. 각 이름의 길이를 세어서 출력하시오. 결과 :[5, 4, 7]
        names2.stream().mapToInt(name -> name.length()).forEach(length -> System.out.print(length + " "));
    }
}
