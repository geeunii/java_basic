package java_advanced_01.day20_0822.AggEx;

import java_advanced_01.day19_0821.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class student {
    private String name;
    private int score;
}

public class Main1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 92),
                new Student("David", 95),
                new Student("Bob", 88)
        );
        List<Student> students2 = Arrays.asList();

        int sum1 = students.stream().mapToInt(Student::getScore).sum();

        int sum2 = students.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);

        int sum3 = students2.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);

        int sum4 = students2.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
