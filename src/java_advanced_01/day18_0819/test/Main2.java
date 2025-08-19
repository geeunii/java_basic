package java_advanced_01.day18_0819.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {

    public static void main(String[] args) {

        class User {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14),
        };

        System.out.println("-------나이 순 오름차순-----------");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        Arrays.sort(users, (User u1, User u2) -> Integer.compare(u1.age, u2.age));  // 람다식

        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }

        Arrays.sort(users, (User u1, User u2) -> u1.name.compareTo(u2.name)); // 이름순 람다식

        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }
    }
}