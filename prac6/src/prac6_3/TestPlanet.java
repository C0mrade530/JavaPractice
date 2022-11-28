package prac6_3;

public class TestPlanet {
    public static void main(String[] args) {
        Nameable venusian = new Planets("Венера");
        Nameable jupiter = new Planets("Юпитер");
        venusian.getName();
        jupiter.getName();
    }
}