package OOP.Challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total price of hamburger = " + hamburger.itemizeHamburger());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 6.00);
        System.out.println("Total price for healthy hamburger is " + healthyBurger.itemizeHamburger());
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();

    }
}
