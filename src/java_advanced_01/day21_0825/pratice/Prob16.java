package java_advanced_01.day21_0825.pratice;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어
// 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) throws Exception{
        // 1. 학생 정보 저장
        List<Student> students = new ArrayList<>();

        students.add(Student.builder().name("김철수").age(21).score(3.5).build());
        students.add(Student.builder().name("이영희").age(22).score(3.9).build());
        students.add(Student.builder().name("박민수").age(20).score(3.2).build());


        String filename = "students.dat";
        // 2. 다시 읽기
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(students.size());

            for (Student student : students) {
                dos.writeUTF(student.getName());
                dos.writeInt(student.getAge());
                dos.writeDouble(student.getScore());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. 총점 평균 출력
        List<Student> studentList = new ArrayList<>();

        double totalScore = 0.0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int numStudents = dis.readInt(); // 저장된 학생 수 읽기

            for (int i = 0; i < numStudents; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();

                studentList.add(Student.builder().name(name).age(age).score(score).build());
                totalScore += score;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // 4. 학생 정보 나이순 출력
        System.out.printf("반 총점 = %.1f  ", totalScore);
        System.out.printf(Locale.US, "반 평균 = %.1f\n", totalScore / studentList.size());

        System.out.println("---");

        // 5. 학생 정보 나이순으로 정렬 및 출력
        studentList.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("학생정보를 나이순으로 콘솔에 출력하세요");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
