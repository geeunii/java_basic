package Grade_Management;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class SortedStudent {

    private static HashMap<String, Student> studentInfo = new HashMap<>();
    private static final File file = new File("Temp/student.dat");
    private static final File avgFile = new File("Temp/orderByAvg.dat");

    public static void main(String[] args) {
        // 파일에서 학생 정보를 불러옴
        if (loadObjectFromFile()) {
            // TreeSet 을 생성하여 데이터를 정렬.
            TreeSet<Student> sortedStudents = createTreeSet();
            // 정렬 결과를 콘솔에 간단히 출력
            printResult(sortedStudents);
            // 정렬된 TreeSet 을 파일에 저장
            outputObject(sortedStudents);
        }
    }

    @SuppressWarnings("unchecked")
    private static boolean loadObjectFromFile() {
        // ois 인스턴스에 file 을 읽어옴
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // ois 를 다 읽어와서 형변환 후 studentInfo 에 할당
            studentInfo = (HashMap<String, Student>) ois.readObject();
            System.out.println("[정렬 및 저장: 평균 오름차순]");
            System.out.println("불러온 학생 수: " + studentInfo.size());
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("[오류] " + file + " 파일을 찾을 수 없습니다.");
            return false;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("[오류] 데이터를 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return false;
        }
    }

    // TreeSet 은 그냥 객체를 정렬 할 수 없어서 Comparator 를 사용해 정렬 규칙 구현
    private static TreeSet<Student> createTreeSet() {
        // 평균 점수 기준으로 정렬하는데 평균 점수가 같은 학생이 두 명 이상일 경우, 이름을 기준으로 오름차순 정렬
        // 즉, 먼저 평균을 비교하고, 이름이 같으면 이름을 비교
        Comparator<Student> avgComparator = Comparator.comparingDouble(Student::getAverage).thenComparing(Student::getName);
        // TreeSet 객체를 생성. avgComparator 를 규칙으로 데이터를 정렬
        TreeSet<Student> sortedSet = new TreeSet<>(avgComparator);
        // 이 컬렉션에 있는 모든 요소를 sortedSet 에 추가
        sortedSet.addAll(studentInfo.values());
        return sortedSet;
    }

    // TreeSet 에 담긴 모든 학생 출력
    private static void printResult(TreeSet<Student> sortedSet) {
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC\n");
        System.out.println("저장 대상(미리보기 상위 10명):");
        for (Student s : sortedSet) {
            System.out.println("- " + s.getName() + " (평균 " + String.format("%.1f", s.getAverage()) + ")");
        }
        System.out.println();
    }

    private static void outputObject(TreeSet<Student> sortedSet) {
        // 정렬된 TreeSet 을 직렬화 가능한 ArrayList 로 변환
        ArrayList<Student> sortedList = new ArrayList<>(sortedSet);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(avgFile))) {
            oos.writeObject(sortedList);    // sortedList 객체를 통째로 읽어 바이트 형태로 변환하고 파일에 작성
            System.out.println("결과 파일: " + avgFile);
            System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 정렬된 결과를 파일에 저장하는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}