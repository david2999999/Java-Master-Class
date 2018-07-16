package OOP.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account("12314", 0.00,
                "Louis", "lou@gmail.com", "1-231-123-1231" );

        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());

        myAccount.withdrawal(100);

        myAccount.deposit(50);
        myAccount.withdrawal(100);

        myAccount.deposit(51);
        myAccount.withdrawal(100);
    }
}
