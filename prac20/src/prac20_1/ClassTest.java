package prac20_1;

public class ClassTest {
    public static void main(String[] args) {
        Class<String, Pet, Double> variable = new Class<>("Hello", new Pet(), 39.05453);
        System.out.println(variable);
    }
}