package Arrays.Autoboxing.challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Dav", 50.05);
        bank.addCustomer("Adelaide", "Jen", 175.34);
        bank.addCustomer("Adelaide", "Percy", 1202);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Jen", 123.21);
        bank.addCustomerTransaction("Adelaide", "Dav", 123.21);
        bank.addCustomerTransaction("Adelaide", "Mike", 123.21);

        bank.listCustomers("Adelaide", true);

    }
}
