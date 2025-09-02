package Grade_Management_Extra;

import java.io.*;
import java.util.*;

public class SortedStudent {

	// 객체로 저장된 Student를 읽어와 평균으로 성적을 오름차순으로 orderByAvg.dat파일에 쓰는 클래스
	// 조건)정렬시 TreeSet과 compator 인터페이스를 이용하여 구현하세요.
	public static void main(String[] args) {
		SortedStudentInnerClass s = new SortedStudentInnerClass();
		s.loadObjectFromFile();
		s.createTreeSet();
		s.printResult();
		s.outputObject();

	}
}

class Compare implements Comparator<Student>, Serializable {

	public int compare(Student o1, Student o2) {
		return o1.getAverage() > o2.getAverage() ? -1 : (o1 == o2 ? 0 : 1);
	}
}

class SortedStudentInnerClass{
	File inputFile = new File("./student.dat");
	File outputFile = new File("./orderByAvg.dat");
	TreeSet<Student> students = new TreeSet<Student>(new Compare());
	HashMap<String, Student> studentInfo = new HashMap<String, Student>();

	void loadObjectFromFile() {
		File file = new File("./student.dat");
		ObjectInputStream ois = null;
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
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	void createTreeSet() {
		students.addAll(studentInfo.values());
	}

	void printResult() {
		Iterator<Student> i = students.iterator();
		int num = 1;
		System.out.println("이  름\t\t국어\t영어\t수학\t과학\t총점\t평균\t학점\t순위");
		System.out
				.println("====================================================");
		while (i.hasNext()) {
			Student temp = i.next();
			System.out.println(temp.getName() + "\t" + temp.toString() + "\t  "
					+ num++);
		}
	}

	void outputObject() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			oos.writeObject(students);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
