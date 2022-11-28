package prac6_3;

public class Planets implements Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Planets(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Name of Planet: " + name);
    }
}