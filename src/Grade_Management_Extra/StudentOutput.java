package Grade_Management_Extra;

import java.io.*;
import java.util.*;

// 저장된 Student 객체를 읽어와 성적순(평균기준)으로 오름차순으로 학생정보를
// 화면으로 출력하는 클래스
public class StudentOutput {
    public static void main(String[] args) {
        StudentOutputInnerClass s = new StudentOutputInnerClass();
        s.loadObjectFromFile();
        s.rearrangeData();
        s.printInfo();
    }
}

class StudentOutputInnerClass {
    HashMap<String, Student> studentInfo = new HashMap<String, Student>();
    ArrayList<Student> datas = new ArrayList<>();
    String[] names;

    void loadObjectFromFile() {
        //파일로 부터 객체 불러오기
        File file = new File("./student.dat");
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            try {
                studentInfo = (HashMap<String, Student>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 위치에 파일이 존재하지 않습니다. =>./student.dat");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void printInfo() {
        //옮긴 데이타 출력
        System.out.println("이  름\t\t국어\t영어\t수학\t과학\t총점\t평균\t학점");
        System.out.println("==============================================");

        Iterator<Student> iterator = datas.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(names[i++] + "\t" + student.toString());
        }
    }


    void rearrangeData() {
        //파일에서 불러온 객체(hashMap)를 다른 객체(Arraylist)에 담기
        names = new String[studentInfo.size()];
        Set<String> keys;
        keys = studentInfo.keySet();
        int i = 0;
        while (true) {
            Iterator<String> iterator = keys.iterator();
            //key값으로 iterator생성
            float higeAVG = 0;
            String highName = "";
            while (iterator.hasNext()) {
                String name = iterator.next();
                if (studentInfo.get(name).getAverage() > higeAVG) {
                    //최고값 비교 로직
                    higeAVG = studentInfo.get(name).getAverage();
                    highName = name;
                }
            }
            datas.add(studentInfo.get(highName));
            names[i++] = highName;
            keys.remove(highName);

            if (studentInfo.size() == 0) break;
            //key가 다 빠지면 종료
        }
    }
}
