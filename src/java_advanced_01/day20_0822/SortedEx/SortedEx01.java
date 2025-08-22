package java_advanced_01.day20_0822.SortedEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "김유진", "정현주", "남기주"
        );

        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println(sortedNames);

        List<String> sortedNames1 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames1);

        List<String> names2 = Arrays.asList("Alice", "Bobi", "Carl", "Dan", "Eve", "David");
        names2.stream().filter(name -> name.startsWith("D")).map(String::toUpperCase).sorted(Comparator.naturalOrder()).forEach(System.out::println);


        System.out.println();
        System.out.println("정수 리스트에서 짝수 필터링하는 자바 스트림 연산");
        List<Integer> integerList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
        integerList.stream().filter(even -> even % 2 == 0).forEach(lastEven -> System.out.print(lastEven + " "));

        System.out.println("\n");
        System.out.println("리스트의 각 정수를 제곱하기 위해 map 연산을 사용하여 연산결과를 출력하시오.");
        integerList.stream().map(square -> square * square).forEach(squareResult -> System.out.print(squareResult + " "));

        System.out.println("\n");
        System.out.println("문자열 리스트에서 중복요소를 제거하기 위해 distinct 연산을 사용하여 결과를 출력");
        List<String> stringList = Arrays.asList(
                "김진우", "김진우", "나영석", "나영석", "다람쥐"
        );
        stringList.stream().distinct().forEach(name -> System.out.print(name + " "));

        System.out.println("\n");
        System.out.println("스트림을 사용하여 정수 리스트를 오름차순하여 출력하세요.");
        List<Integer> integerList1 = Arrays.asList(
                10, 1233, 6235, 213456, 737383, 5, 222
        );
        integerList1.stream().sorted().forEach(num -> System.out.print(num + " "));

        System.out.println("\n");
        System.out.println("정수리스트에서 리스트의 모든 짝수의 합을 구하여 출력하세요.");
        int sum = integerList1.stream().filter(even -> even % 2 == 0).mapToInt(num -> num).sum();
        System.out.println(sum);
    }
}
