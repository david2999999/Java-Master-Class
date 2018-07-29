package AccessModifier;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("Dav");
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();

        System.out.println("Balance on account is " + myAccount.getBalance());


    }
}
