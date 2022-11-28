package prac4_9;
//Создать абстрактный класс, описывающий сущность мебель. С
//помощью наследования реализовать различные виды мебели. Также создать
//класс FurnitureShop, моделирующий магазин мебели. Протестировать работу
//классов

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(2);
        shop.add(new Wardrobe(
                "Гардероб для квартиры", 0, 2.05, 1, 1, 14540, "Металл+Дерево", 3, 10));
        shop.add(new Table(
                "Раскладной стол", 4, 1.3, 1, 1, 5999, "Дуб", 2));
        System.out.println(shop.getPrices());
        System.out.println("Приобретено: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}