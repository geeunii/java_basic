package Collection_Que.Que04;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        TreeSet<Student> treeSet1 = new TreeSet<>((s1, s2) -> Integer.compare(s1.score, s2.score));

        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 점수를 받은 아이디: " + student.id);
    }
}
