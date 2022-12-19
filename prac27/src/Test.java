public class Test {
    public static void main(String[] args) {
        Diction dic = new Diction();
        dic.hashtabHash();
        dic.hashtabInit();
        dic.hashtabAdd("1", "Меркурий");
        dic.hashtabAdd("2", "Венера");
        dic.hashtabAdd("3", "Земля");
        dic.hashtabAdd("4", "Марс");
        dic.hashtabAdd("5", "Юпитер");
        dic.hashtabAdd("6", "Сатурн");
        dic.hashtabAdd("7", "Уран");
        dic.hashtabAdd("8", "Нептун");
        dic.hashtabAdd("9", "Плутон");
        dic.print();
        System.out.println();
        System.out.println(dic.hashtabLookup("3"));
        System.out.println();
        dic.hashtabDelete("4");

    }
}