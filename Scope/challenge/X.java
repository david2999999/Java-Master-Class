package Scope.challenge;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " time " + this.x + " equals " + x * this.x);
        }
    }
}
