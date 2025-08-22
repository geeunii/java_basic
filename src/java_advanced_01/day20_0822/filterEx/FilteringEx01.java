package java_advanced_01.day20_0822.filterEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("신세계");
        list.add("신세계");
        list.add("Java");
        list.add("김민성");
        list.add("김민서");

        List<String> list1 = Arrays.asList(
                new String("신명성"),
                new String("김미영"),
                new String("신세경")
        );

        list.forEach(System.out::println);
        System.out.println();
        System.out.println("중복요소 제거");
        list.stream().distinct().forEach(System.out::println);

        System.out.println();

        // list2에서 중복을 제거하고 이름에 "신" 들어간 사람의 이름을 출력하시오
        list1.forEach(System.out::println);
        System.out.println();
        // 같은 이름 제거 필터
        list1.stream().distinct().forEach(System.out::println);
        System.out.println();
        // 같은 이름 제거 필터링 후 이름에 "신"씨만 출력
        list1.stream().distinct().filter(name -> name.startsWith("신")).forEach(name -> System.out.println());
    }
}
