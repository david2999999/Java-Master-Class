package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Dav", 10, "Wand");
        System.out.println("Initial health is " + enhancedPlayer.getHitPoint());
    }
}
