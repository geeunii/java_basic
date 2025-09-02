package Grade_Management;


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class StudentOutput { // student.dat 에서 학생 객체들을 읽어와 평균 기준 오름차순으로 정렬 후 화면 출력

    // 동일하게 생성
    private static HashMap<String, Student> studentInfo = new HashMap<>();
    private static final File file = new File("Temp/student.dat");

    public static void main(String[] args) {
        // 파일에서 객체를 불러옵니다.
        if (loadObjectFromFile()) {
            // 데이터를 평균 순으로 정렬합니다.
            List<Student> sortedList = rearrangeData();
            // 정렬된 결과를 화면에 출력합니다.
            printInfo(sortedList);
        }
    }

    @SuppressWarnings("unchecked")  // 제네릭 타입 경고 처리
    private static boolean loadObjectFromFile() {
        // 파일에서 객체를 읽어드림
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // ois.readObject() 파일에 저장된 객체를 읽어서 반환.
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
        // studentInfo HashMap 에 저장된 모든 값들, Student 객체들을 컬렉션 형태로 반환.
        // 반환된 Student 객체들의 컬렉션을 가지고 새로운 ArrayList 생성. studentList 라는 이름의 List 변수에 모든 학생 객체들이 담기게 됨.
        List<Student> studentList = new ArrayList<>(studentInfo.values());

        // Comparator 를 사용하여 평균(average) 기준으로 오름차순 정렬.
        // 람다식. studentList 를 정렬 하는데 Comparator(두 객체를 비교하여 정렬 순서를 결정)
        // 이 제공하는 인터페이 comparingDouble 정적 메서드로 더블 타입의 값을 기준으로 객체를 비교
        // studentList 의 각 Student 객체에 대해 메서드 호출. 그 반환 값인 ㅍ여균 점수를 기준으로 사용
        // 즉, 학생들의 평균 점수를 기준으로 오름차순으로 정렬
        studentList.sort(Comparator.comparingDouble(Student::getAverage));

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
