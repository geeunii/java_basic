package java_advanced_01.day19_0821;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamEx {

    public static void main(String[] args) {
        String[] str = new String[]{"1", "2", "3", "4", "5"};
        Stream<String> stream = Arrays.stream(str);
        // stream.forEach(System.out::println);
        stream.forEach(item -> System.out.print(item + " "));

        System.out.println();

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> integerStream = Arrays.stream(integers);
        integerStream.forEach(System.out::println);
    }
}
