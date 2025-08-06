package javabasic_02.day11_0806.HierarchicalInheritance02;

public class FamilyMain {

    public static void main(String[] args) {
        SubSon objSon = new SubSon();
        SubDaughter objDaughter = new SubDaughter();

        objSon.printSon();
        objSon.familyName();
        objSon.houseAddress();
        objSon.printFather();

        objDaughter.printDaughter();
        objDaughter.familyName();
        objDaughter.houseAddress();
        objDaughter.printFather();
    }
}
