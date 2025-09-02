package Grade_Management;


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class StudentOutput {

    private static HashMap<String, Student> studentInfo = new HashMap<>();
    private static final File file = new File("Temp/student.dat");

    public static void main(String[] args) {
        // 1. 파일에서 객체를 불러옵니다.
        if (loadObjectFromFile()) {
            // 2. 데이터를 평균 순으로 정렬합니다.
            List<Student> sortedList = rearrangeData();
            // 3. 정렬된 결과를 화면에 출력합니다.
            printInfo(sortedList);
        }
    }

    @SuppressWarnings("unchecked")
    private static boolean loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("[오류] " + file + " 파일을 찾을 수 없습니다.");
            return false;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("[오류] 데이터를 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return false;
        }
    }

    private static List<Student> rearrangeData() {
        // HashMap의 값들(Student 객체)을 ArrayList로 변환합니다.
        List<Student> studentList = new ArrayList<>(studentInfo.values());

        // Comparator를 사용하여 평균(average) 기준으로 오름차순 정렬합니다.
        // 초보자가 이해하기 쉬운 익명 클래스 방식으로 Comparator를 구현합니다.
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // s1의 평균이 s2의 평균보다 작으면 음수, 크면 양수, 같으면 0을 반환
                return Double.compare(s1.getAverage(), s2.getAverage());
            }
        });

        return studentList;
    }

    private static void printInfo(List<Student> studentList) {
        System.out.println("\n[평균 오름차순 성적표]\n");
        int rank = 1;
        for (Student student : studentList) {
            System.out.println(rank + ") " + student.getName());
            // toString() 메소드를 활용하지 않고, 요구사항 형식에 맞춰 직접 출력
            System.out.println("   점수: " + student.getRecord());
            System.out.println("   총점: " + student.getTotal() +
                    ", 평균: " + String.format("%.1f", student.getAverage()) +
                    ", 학점: " + student.getGrade());
            System.out.println();
            rank++;
        }
    }
}
