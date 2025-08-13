package java_advanced_01.day15_0813.generic;

public class BoxModelMain {

    public static void main(String[] args) {
        // 로켓 프레시 라인, 철호가 배추, 무, 상추, 삼겹살 구매후 물품을 box에 담고 box 담긴 내용을 출력하세요.
        BoxModel<String> box = new BoxModel<String>();

        box.content = new String[]{"배추", "무", "상추", "고기"};

        for (String content : box.content) {
            System.out.print(content + "\t");
        }
    }
}
