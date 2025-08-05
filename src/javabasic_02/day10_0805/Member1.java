package javabasic_02.day10_0805;

public class Member1 {
    String name;
    String id;
    String password;
    int age;

    public Member1(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Member1 user1 = new Member1("홍길동", "hong");
        System.out.println(user1.name + " " + user1.id);
    }
}
