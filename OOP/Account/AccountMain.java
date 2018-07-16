package OOP.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setNumber("12314");
        myAccount.setBalance(0.00);
        myAccount.setCustomerName("Louis");
        myAccount.setCustomerEmailAddress("lou@gmail.com");
        myAccount.setCustomerPhoneNumber("1-231-123-1231");

        myAccount.withdrawal(100);

        myAccount.deposit(50);
        myAccount.withdrawal(100);

        myAccount.deposit(51);
        myAccount.withdrawal(100);
    }
}
