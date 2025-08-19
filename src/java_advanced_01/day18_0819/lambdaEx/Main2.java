package java_advanced_01.day18_0819.lambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Char", "David");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toUnmodifiableList());
        System.out.println(filteredNames);
    }

}
