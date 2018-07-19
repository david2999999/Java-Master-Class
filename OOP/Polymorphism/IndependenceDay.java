package OOP.Polymorphism;

public class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Lots of Aliens";
    }
}
