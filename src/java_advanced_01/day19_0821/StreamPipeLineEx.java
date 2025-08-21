package java_advanced_01.day19_0821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Geuni", 90));
        students.add(new Student("Leo", 80));
        students.add(new Student("Vex", 60));

        List<Student> studentList = Arrays.asList(
                new Student("A", 40),
                new Student("B", 65),
                new Student("C", 75)
        );

        // 방법1 스트림 => 중간처리 => 최종처리 => 학생들의 평균 점수
        // 스트림 얻기
        Stream<Student> studentStream1 = students.stream();

        // 중간처리 (학생 객체를 점수[정수타입]로 매핑)
        IntStream scoreStream = studentStream1.mapToInt(student -> student.getScore());

        // 최정처리 (평균구하기)
        double averageScore = scoreStream.average().getAsDouble();
        System.out.println(averageScore);

        // 방법2 람다식을 주입해서 파이프라인 처리 방식
    }
}
