package java_advanced_01.day17_0818.unmodifiable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableEx {
    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> list = List.of("Apple", "Banana", "Pear", "Orange");
        // list.add("Grape");   -> 불변이라 add 안됨. 이미 정해진 과일들.
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        Map<String, Integer> map = Map.of("Apple", 10000, "Banana", 2500, "Pear", 3000);
        for (String s : map.keySet()) {
            System.out.println(s);
            System.out.println(map.get(s)); // 가격도 불러오기.
        }

        System.out.println();

        // 배열로부터 수정할 수 없는 List 컬렉션 생성방법.
        String[] arr = new String[]{"Apple", "Banana", "Pear", "Orange"};
        List<String> list2 = List.of(arr);
        List<String> list3 = Arrays.asList(arr);
    }
}
