package java_advanced_01.day20_0822.sec.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		// 남, 여 학생들의 평균 점수를 각각 구하시오.
		Map<String, Double> map = totalList.stream().collect(
				Collectors.groupingBy(student -> student.getGender(), Collectors.averagingDouble(student -> student.getScore()))
		);
		System.out.println(map);


	}
}