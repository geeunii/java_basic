package java_advanced_01.day15_0813;

public class MyResource implements AutoCloseable {

    private String name;

    MyResource(String name) {
        this.name =  name;
        System.out.println("[MyResource] (" + name + ") 열기");
    }

    public String read1() {
        System.out.println("[MyResource] (" + name + ") 읽기");
        return "100";
    }




    @Override
    public void close() throws Exception {

    }
}
