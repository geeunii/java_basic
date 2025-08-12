package java_advanced_01.day14_0812.ExceptionEx;

public class ExceptionHandlingEx {

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        try {
            printLength("This is Exception Class");
            printLength(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.fillInStackTrace(); // e.printStackTrace();
        } finally {
            System.out.println("마무리 블럭");
        }
        System.out.println("프로그램 종료");
    }

    static void printLength(String param) {
        int strLength = param.length();
        System.out.println("전달받은 문자열의 길이 " + strLength);
    }
}
