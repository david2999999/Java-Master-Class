package OOP.VipCustomer;

public class VIpCustomerMain {
    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());

        VipCustomer customer1 = new VipCustomer("Lis", 2500);
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailAddress());
    }
}
