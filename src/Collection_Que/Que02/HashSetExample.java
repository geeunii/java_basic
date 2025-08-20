package Collection_Que.Que02;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    static int studentNum = 0;

    static int studentNum() {
        studentNum++;
        return studentNum;
    }

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(); // -> HashSet<>() 을 TreeSet<>()으로 변경해서 학번 x오름차순 출력

        set.add(new Student(studentNum(), "홍길동"));
        set.add(new Student(studentNum(), "신용권"));
        set.add(new Student(studentNum(), "조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + ":" + s.name);
        }
    }
}
