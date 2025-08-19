package java_advanced_01.day18_0819.Anonymous.class5;

public interface Operate {
    int operate(int a, int b);

    default void print() {
        System.out.println("print");
    }
}
