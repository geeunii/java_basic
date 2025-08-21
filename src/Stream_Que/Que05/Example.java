package Stream_Que.Que05;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        // List에 저장되어 있는 String 요소에서 대소문자와 상과없이 'java'라는 단어가 포함된 문자열만 필터링해서 출력하려고 합니다.
        // 빈칸에 알맞은 코드를 작성하시오.

        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))  // 각 문자열을 소문자로 변환시키고 java 포함 여부 검사
                .forEach(s -> System.out.println(s));   // 필터링 한 것들 출력
    }
}
