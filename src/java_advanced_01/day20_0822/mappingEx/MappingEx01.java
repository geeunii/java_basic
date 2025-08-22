package java_advanced_01.day20_0822.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("신세경", 100));
        studentList.add(new Student("바다", 95));
        studentList.add(new Student("태양", 80));

        studentList.stream().mapToInt(student -> student.getScore()).forEach(score -> System.out.println(score));
        // 참조식: studentList.stream().map(Student::getScore).forEach(System.out::println);


    }
}
