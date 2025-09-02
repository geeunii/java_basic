package Grade_Management_Extra;

import java.io.*;
import java.util.*;

// 콘솔로부터 학생의 정보를 입력받아 student.dat 파일에 저장하는 클래스
public class StudentInput {

    public static void main(String[] args) {
        StudentInputInnerClass s = new StudentInputInnerClass();
        s.loadCheck();
        s.printUsage();
        s.checkKeyAndInputData();
        s.saveData();
    }

}

class StudentInputInnerClass {
    File file = new File("./student.dat");
    FileOutputStream fos;
    HashMap<String, Student> studentInfo = new HashMap<String, Student>();
    StringTokenizer strToken;

    void loadCheck() {
        // 저장되있으면 hashmap 에 불러오기
        ObjectInputStream out = null;
        try {
            out = new ObjectInputStream(new FileInputStream(file));
            try {
                studentInfo = (HashMap<String, Student>) out.readObject();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (IOException e) {
        }
    }

    void printUsage() {
        // 사용법 출력
        System.out.println("데이터를 입력하세요!! : (이름, 국어, 영어, 수학, 과학)");
        System.out.println("입력 종료 : exit");
        System.out.println("=================================================");
    }

    void checkKeyAndInputData() {
        // 입력받은 키가 존재하는지 확인하고
        // 1. 없으면 만들고
        // 2. 있으면 덮어쓰기

        Student student;
        BufferedReader bis = new BufferedReader(
                new InputStreamReader(System.in));
        String temp;
        int records[] = new int[4];
        try {
            while ((temp = bis.readLine()) != "exit") {
                if (temp.equals("exit")) break;
                strToken = new StringTokenizer(temp, ",");
                String name = strToken.nextToken();
                if (strToken.countTokens() != 4) {
                    System.out.println("누락된 항목이 존재합니다.");
                    //누락된 항목이 존재하면 다시 while돌리기(재입력 받기)
                } else {
                    int i = 0;
                    //예외처리
                    while (strToken.hasMoreTokens()) {
                        try {
                            records[i++] = Integer.parseInt(strToken.nextToken());
                            //입력받은 값이 0부터 100사이인지 검사
                            if (!(records[0] >= 0 && records[0] <= 100 &&
                                    records[1] >= 0 && records[1] <= 100 &&
                                    records[2] >= 0 && records[2] <= 100 &&
                                    records[3] >= 0 && records[3] <= 100)) {
                                throw new NumberFormatException();
                            }
							// 복원하고 있는 과정.
                            student = new Student(name, records[0], records[1], records[2], records[3]);
                            //임시 객체 생성해서
                            if (studentInfo.containsKey(name)) {
                                // 이름이 존재하면 교체
                                studentInfo.replace(name, student);
                            } else {
                                // 존재하지 않으면 추가
                                studentInfo.put(name, student);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("입력된 점수가 올바르지 않습니다.");
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveData() {
        //임시 저장된 HashMap을 File로 저장하는 메소드
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(studentInfo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
