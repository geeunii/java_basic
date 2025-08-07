package javabasic_02.day12_0807.Diagram;

public class DiagramMain {

    public static void main(String[] args) {
        // 사각형, 삼각형, 원 클래스는 서로 다른 타입이어서 각각 타입을 정의해서 같은 타입끼리 묶어서 관리하겠음.

        Quadrangle[] quadrangles = new Quadrangle[4];
        quadrangles[0] = new Quadrangle();
        quadrangles[1] = new Quadrangle();
        quadrangles[2] = new Quadrangle();
        quadrangles[3] = new Quadrangle();

        Triangle[] triangles = new Triangle[5];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();
        }

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        // 하나의 자료형 Shape 으로 관리하니 코드량도 적어지고 가독성도 좋아짐. 유지보수성도 좋아짐
        Shape[] shapes = new Shape[4];
        shapes[0] = quadrangles[0];
        shapes[1] = quadrangles[1];
        shapes[2] = triangles[2];
        shapes[3] = circles[2];

        // 다운캐스팅
        Circle circle = (Circle) shapes[3];

        // 자식 클래스에서만 있는 고유 메서드를 실행하려면 업캐스팅한 객체를 다시 자식클래스로 다운캐스팅 해주어야 함.

    }

}