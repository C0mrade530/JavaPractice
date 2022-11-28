package prac6_4;

public class FurnitureTest {
    public static void main(String[] args) {
        Priceable table = new Furniture(9999, "Акула из Икеи");
        Priceable chair = new Furniture(3599, "Стул складной");
        Priceable wardrobe = new Furniture(29990, "Душевая кабина");
        table.getPrice();
        chair.getPrice();
        wardrobe.getPrice();
    }
}