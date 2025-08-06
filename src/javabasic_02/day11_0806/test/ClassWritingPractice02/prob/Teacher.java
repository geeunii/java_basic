package javabasic_02.day11_0806.test.ClassWritingPractice02.prob;

public class Teacher {
    private String name;
    private int age;
    private String subject;

    public Teacher() {
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

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print() {
//        System.out.printf("이   름 : %s \t나 이 : %d \t담당과목 : %s\n", name, age, subject);
        System.out.printf("이   름 : %s \t나 이 : %d \t담당과목 : %s\n", this.name, this.age, this.subject);
    }
}
