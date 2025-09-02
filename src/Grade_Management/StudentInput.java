package Grade_Management;

import java.io.*;
import java.util.*;

public class StudentInput {

    // 전역 변수 HashMap<T, V> 변수에 새로운 HashMap<>() 생성.
    private static HashMap<String, Student> studentInfo = new HashMap<>();
    // 상수 File 타입 file 변수에 새로운 File 타입인 위치 생성
    private static final File file = new File("Temp/student.dat");

    public static void main(String[] args) {
        // 1. 기존 파일이 있으면 불러오고, 없으면 새로 시작합니다.
        loadCheck();
        // 2. 사용자에게 프로그램 사용법을 안내합니다.
        printUsage();
        // 3. 사용자로부터 입력을 받습니다.
        checkKeyAndInputData();
        // 4. 입력이 완료되면 파일에 저장합니다.
        saveData();
    }

    @SuppressWarnings("unchecked")  // 제네릭 타입 때문에 발생한 경고 처리
    private static void loadCheck() {

        if (file.exists()) {    // file 이 존재하는지 체크
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                studentInfo = (HashMap<String, Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("[오류] 파일이 존재하지 않습니다. 새로 생성합니다.");
                studentInfo = new HashMap<>(); // 오류 발생 시 새로 생성
            }
        } else {
            System.out.println("[안내] 기존 데이터 파일이 없어 새로 시작합니다.");
        }
    }

    private static void printUsage() {
        System.out.println("\n[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
        System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다.");
    }

    private static void checkKeyAndInputData() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();

            if ("^^".equals(name) || "exit".equalsIgnoreCase(name)) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            // 이름 중복 검사
            if (studentInfo.containsKey(name)) {
                System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
                continue;
            }

            try {
                // 4과목 점수 입력
                List<Integer> scores = new ArrayList<>();
                System.out.print("국어: ");
                scores.add(Integer.parseInt(sc.nextLine()));
                System.out.print("영어: ");
                scores.add(Integer.parseInt(sc.nextLine()));
                System.out.print("수학: ");
                scores.add(Integer.parseInt(sc.nextLine()));
                System.out.print("과학: ");
                scores.add(Integer.parseInt(sc.nextLine()));

                // 점수 범위 유효성 검사 (0~100)
                boolean isValid = true;
                for (int score : scores) {
                    if (score < 0 || score > 100) {
                        System.out.println("[오류] 점수는 0에서 100 사이의 정수여야 합니다.");
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    Student student = new Student(name, scores);
                    studentInfo.put(name, student);
                    System.out.println("=> 저장됨: " + name + " (총점=" + student.getTotal() + ", 평균=" + student.getAverage() + ", 학점=" + student.getGrade() + ")\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("[오류] 점수는 숫자로만 입력해주세요.");
            }
        }
    }

    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentInfo);
            System.out.println("[완료] " + studentInfo.size() + "명의 정보가 " + file + " 에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 파일 저장 중 문제가 발생했습니다: " + e.getMessage());
        }
    }
}