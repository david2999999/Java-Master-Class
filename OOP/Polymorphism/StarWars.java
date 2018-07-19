package OOP.Polymorphism;

public class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Taking over the universe";
    }
}
