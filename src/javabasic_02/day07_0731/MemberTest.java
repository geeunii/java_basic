package javabasic_02.day07_0731;

public class MemberTest {
    public static void main(String[] args) {

        Member member1 = new Member();

        member1.userName = "홍길동";
        member1.age = 30;
        member1.userPhone = "010-1111-1111";
        member1.eMail = "fc@naver.com";
        member1.address = "서울";
        member1.weight = 57.6;

        System.out.println(member1.userName);
        System.out.println(member1.age);
        System.out.println(member1.userPhone);
        System.out.println(member1.eMail);
        System.out.println(member1.address);
        System.out.println(member1.weight);

    }
}
