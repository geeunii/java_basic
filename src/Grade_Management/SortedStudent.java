package Grade_Management;

import java.io.*;
import java.util.*;

public class SortedStudent {

    private static HashMap<String, Student> studentInfo = new HashMap<>();
    private static final File file = new File("Temp/student.dat");
    private static final File avgFile = new File("Temp/orderByAvg.dat");

    public static void main(String[] args) {
        // 1. 파일에서 학생 정보를 불러옵니다.
        if (loadObjectFromFile()) {
            // 2. TreeSet을 생성하여 데이터를 정렬합니다.
            TreeSet<Student> sortedStudents = createTreeSet();
            // 3. 정렬 결과를 콘솔에 간단히 출력합니다.
            printResult(sortedStudents);
            // 4. 정렬된 TreeSet을 파일에 저장합니다.
            outputObject(sortedStudents);
        }
    }

    private static boolean loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
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

    private static TreeSet<Student> createTreeSet() {
        Comparator<Student> avgComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // ... (기존 정렬 로직)
                int avgCompare = Double.compare(s1.getAverage(), s2.getAverage());
                if (avgCompare != 0) {
                    return avgCompare;
                }
                return s1.getName().compareTo(s2.getName());
            }
        };
        TreeSet<Student> sortedSet = new TreeSet<>(avgComparator);
        sortedSet.addAll(studentInfo.values());
        return sortedSet;
    }


    private static void printResult(TreeSet<Student> sortedSet) {
        System.out.println("\n[정렬 및 저장: 평균 오름차순]");
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC");
        System.out.println("저장 대상(미리보기):");
        for (Student s : sortedSet) {
            System.out.println("- " + s.getName() + " (평균 " + String.format("%.1f", s.getAverage()) + ")");
        }
        System.out.println();
    }

    private static void outputObject(TreeSet<Student> sortedSet) {
        // 정렬된 TreeSet을 직렬화 가능한 ArrayList로 변환합니다.
        ArrayList<Student> sortedList = new ArrayList<>(sortedSet);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(avgFile))) {
            // ArrayList 객체를 파일에 저장합니다.
            oos.writeObject(sortedList);
            System.out.println("결과 파일: " + avgFile);
            System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 정렬된 결과를 파일에 저장하는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}