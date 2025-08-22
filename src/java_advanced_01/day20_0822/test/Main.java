package java_advanced_01.day20_0822.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

class Person {
    private Phone phoneNumber;  //객체 생성시 초기화
    private String name;

    Person(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return this.phoneNumber;
    }
}


class Phone {
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS() {
        return "IOS";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        // person.getPhone().getOs().printOS();

        Person p = new Person("홍미자");
        Phone ph = p.getPhone();
        if (ph != null) {
            OS os = ph.getOs();
        } if (ph == null) {
            String osName = System.getProperty("os.name").toLowerCase();
        }

        // Optional 클래스 NPE 처리
        Person p1 = new Person("서유미");

        Optional.ofNullable(p1).map(Person::getPhone).map(Phone::getOs).map(OS::printOS);
    }
}
