package Stream_Que.Que06;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        // List에 저장되어 있는 Member의 평균 나이를 출력하려고 합니다.
        // 빈칸에 알맞은 코드를 작성해보세요.

        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("홍길동", 40),
                new Member("감자바", 26)
        );

        // 빈칸
        double avg = list.stream().mapToDouble(member -> member.getAge())
                .average()
                .getAsDouble();
        System.out.println("평균 나이: " + avg);
    }
}
