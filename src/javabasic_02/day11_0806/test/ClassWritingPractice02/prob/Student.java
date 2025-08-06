package javabasic_02.day11_0806.test.ClassWritingPractice02.prob;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
//        System.out.printf("이   름 : %s \t나 이 : %d \t학  번 : %d\n", name, age, id);
        System.out.printf("이   름 : %s \t나 이 : %d \t학  번 : %d\n", this.name, this.age, this.id);
    }
}
