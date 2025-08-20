package Collection_Que.Que03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수 받은 아이디 저장 변수
        int maxScore = 0;   // 최고 점수 저장 변수
        int totalScore = 0; // 점수 합계 저장 변수

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            int count = entry.getValue();

            totalScore += count;
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }

        System.out.println("평균 점수: " + totalScore / map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
