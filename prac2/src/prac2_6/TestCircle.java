package prac2_6;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(4, 5, 6);
        System.out.println(c1);
        Circle c2 = new Circle(2, 7, 3);
        System.out.println(c2);
        c1.move(-4, 2);
        System.out.println(c1);
        c1.radius(2.12);
        System.out.println(c1);
        c1.compare(c1.getR(), c2.getR());
    }
}