package BeginnerBook.Constructor;

public class Que_7_1 {
    // 밑변과 높이 정보를 저장할수 있는 Triangle 클래스를 정의하자. 그리고 생성과 동시에 초기화가 가능한 생성자도 정의하자.
    // 끝으로 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼격형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20);

        System.out.println("초기 넓이: " + triangle.area());

        triangle.setBase(20);
        triangle.setHeight(30);

        System.out.println("바뀐 후 넓이: " + triangle.area());
    }
}
