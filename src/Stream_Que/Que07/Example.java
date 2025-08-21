package Stream_Que.Que07;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        // List에 저장되어 있는 Member 중에서 직업이 '개발자'인 사람만 별도의 List에 수집하려고 합니다.
        // 빈칸에 알맞은 코드를 작성해보세요.

        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream().filter
                (job -> job.getJob().equals("개발자")).toList();

        developers.stream().forEach(job -> System.out.println(job.getName()));
    }
}
