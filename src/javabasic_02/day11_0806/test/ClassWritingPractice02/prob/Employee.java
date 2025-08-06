package javabasic_02.day11_0806.test.ClassWritingPractice02.prob;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        System.out.printf("이\t름 : %s\t나 이 : %d\t부\t서 : %s", name, age, dept);
    }
}
