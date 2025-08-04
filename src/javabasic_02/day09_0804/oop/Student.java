package javabasic_02.day09_0804.oop;

import java.util.Arrays;

public class Student {
    // Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String suy_ssn;
    private String subject;
    private int[] studentScore;
    String gender;

    Student(String stu_name, String suy_ssn) {
        this.stu_name = stu_name;
        this.suy_ssn = suy_ssn;
    }

    Student(String stu_name, Integer stu_age, String address, String suy_ssn) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.address = address;
        this.suy_ssn = suy_ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", suy_ssn='" + suy_ssn + '\'' +
                ", subject='" + subject + '\'' +
                ", studentScore=" + Arrays.toString(studentScore) +
                ", gender='" + gender + '\'' +
                '}';
    }


    // 생성자를 통하여 학생 객체의 필드를 초기화
    Student() { // 기본 생성자
    }

    // this. -> 내 공간에 대한 주소값.
    Student(String stu_name, Integer stu_age, String address, String suy_ssn, String subject) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.address = address;
        this.suy_ssn = suy_ssn;
        this.subject = subject;
    }

    Student(int[] studentScore) {
        this.studentScore = studentScore;
    }

    public void getStudentScore() {
        for (int i = 0; i < 3; i++) {
            System.out.print(studentScore[i] + " ");
        }
    }

    public int total() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += studentScore[i];
        }

        return total;
    }

    public double avg() {
        double avg = 0;
        avg = (double) total() / 3;

        return avg;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getSuy_ssn() {
        return suy_ssn;
    }

    public String getSubject() {
        return subject;
    }
}
