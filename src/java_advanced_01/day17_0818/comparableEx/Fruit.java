package java_advanced_01.day17_0818.comparableEx;

import java.util.TreeSet;

// 과일이 있음. 과일을 가격 기준으로 오름차순 정렬할 수 있도록 비교기를 구현.
public class Fruit implements Comparable<Fruit> {

    public static void main(String[] args) {
        TreeSet<Integer> price = new TreeSet<>();

        price.add(10000);   // 사과
        price.add(12000);   // 귤
        price.add(8000);    // 복숭아
        price.add(18000);   // 포도

        for (Integer i : price) {
            System.out.println("가격 기준 정렬 : " + i + " ");
        }

        System.out.println();
    }

    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
