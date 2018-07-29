package Final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Louis";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB contructor called");
    }

    static {
        System.out.println("2nd Initialization block called");
    }

    public void someMethod() {
        System.out.println("Some Method called");
    }
}
