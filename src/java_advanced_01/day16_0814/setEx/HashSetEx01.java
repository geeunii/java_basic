package java_advanced_01.day16_0814.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("JSP");
        set.add("Spring");

        int size = set.size();

        System.out.println(size);

    }
}
