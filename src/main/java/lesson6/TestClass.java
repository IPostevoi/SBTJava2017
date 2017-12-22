package lesson6;

/**
 * Created by bakla410 on 13.10.17.
 */
public class TestClass {

    private String name = "default";

    public void doSmth() {}

    @RunMe
    public void doTest(TestClass x) {
        System.out.println(x.getName());
    }

    public int doTest1(int num) {
        System.out.println(num);
        return num;
    }

    public String getName() {
        return name;
    }
}
