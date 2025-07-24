package day02;

public class StringEx {

    public static void main(String[] args) {
        String name = "신세계";
        String job = "프로그래머";

        System.out.println(name + "과장의 직무는" + job + "입니다.");

        String str = "나는 \'Java\'를 배우고 있습니다.";
        System.out.println(str);

        String str1 = "나는\tJava\t를 배우고 있습니다.";
        System.out.println(str1);

        String str3 = """
                {
                "id":"spring",
                "name":"geuni"
                }
                """;
        System.out.println(str3);

        System.out.println("======================");

        String str4 = """
                나는 자바프로그래밍 \
                공부를 하고 있습니다.
                나는 자바개발자를 희망합니다.           
                """;

        System.out.println(str4);

    }
}
