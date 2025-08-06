package javabasic_02.day11_0806.MultilevelInheritance02;

public class SubSon extends SubFather {
    void printSon() {
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
    }

    public static void main(String[] args) {
        SubSon objSon = new SubSon();

        objSon.printSon();
        objSon.familyName();
        objSon.houseAddress();
        objSon.printFather();
        objSon.printGrandFather();

    }
}
