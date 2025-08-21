package java_advanced_01.day19_0821;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("1234", "A", "A 전문회사", 10000));
        products.add(new Product("2345", "B", "B 전문회사", 20000));
        products.add(new Product("3456", "C", "C 전문회사", 30000));
        products.add(new Product("4567", "D", "D 전문회사", 40000));
        products.add(new Product("5678", "E", "E 전문회사", 50000));

        products.forEach(System.out::println);


    }
}
