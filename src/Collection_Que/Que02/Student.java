package Collection_Que.Que02;

public class Student implements Comparable<Student> {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.name = name;
        this.studentNum = studentNum;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            return target.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode() { // 주소값 비교
        int count = 0;
        return name.hashCode() + count++;
    }

    @Override
    public int compareTo(Student other) {
        return this.studentNum - other.studentNum;
    }
}
