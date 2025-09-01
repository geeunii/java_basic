package Grade_Management;

import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Integer> record;
    private int total;
    private double average;
    private String grade;


    public Student(String name, List<Integer> record) {
        this.name = name;
        this.record = record;
        // 객체가 생성될 때 총점, 평균, 학점을 바로 계산합니다.
        calculateStats();
    }

    // 총점, 평균, 학점을 계산하는 메소드
    private void calculateStats() {
        // 총점 계산
        this.total = 0;
        for (int score : this.record) {
            this.total += score;
        }

        // 평균 계산
        if (!this.record.isEmpty()) {
            this.average = (double) this.total / this.record.size();
        }

        // 학점 계산
        if (this.average >= 90) {
            this.grade = "A";
        } else if (this.average >= 80) {
            this.grade = "B";
        } else if (this.average >= 70) {
            this.grade = "C";
        } else if (this.average >= 60) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }

    @Override
    public String toString() {
        return "이름: " + name + "\n" +
                "점수: " + record + "\n" +
                "총점: " + total + ", 평균: " + String.format("%.1f", average) + ", 학점: " + grade;
    }
}
