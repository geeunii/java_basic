package java_advanced_01.day15_0813.generic;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<Apple> {
    List<Apple> fruits = new ArrayList<>();     // 클래스 필드

    public void add(Apple fruit) {
        fruits.add(fruit);
    }

}
