package Final;

public class Main2 {
    public static void main(String[] args) {
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();


        password.letMeIn(1);
        password.letMeIn(12312);
        password.letMeIn(312);
        password.letMeIn(pw);
    }
}
