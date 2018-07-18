package OOP.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("TX-200", "Asus", 4, 6, "v2.123");

        PC thePc = new PC(theCase, theMonitor, theMotherBoard);

        thePc.getMonitor().drawPixelAt(1500, 1200, "Red");
        thePc.getMotherboard().loadProgram("Window 11");
        thePc.getTheCase().pressPowerButton();
    }
}
