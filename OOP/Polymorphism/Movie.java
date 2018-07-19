package OOP.Polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}
