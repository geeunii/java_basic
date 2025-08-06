package javabasic_02.day11_0806.test.ClassWritingPractice03.prob;

public class Emp {
    private String id;  // 사원번호
    private String name;    // 사원이름
    private int baseSalary; //사원의 기본급

    public Emp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        // salary = baseSalary + baseSalary * bonus; // 봉급계산
        double salary = 0.0;
        salary = baseSalary + baseSalary * bonus;
        return salary;
    }

    public String toString() {

        return name + "(" + id + ")" + " " + "사원의 기본급은" + " " + baseSalary + "원 입니다.";
    }
}
