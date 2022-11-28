package prac4_1;

public class Main {
    public static void finder(Seasons season) {
        switch (season) {
            case WINTER: System.out.println("i love зиму.\n"); break;
            case SPRING: System.out.println("i love весну.\n"); break;
            case SUMMER: System.out.println("i love лето.\n"); break;
            case AUTUMN: System.out.println("i love осень.\n"); break;
        }
    }
    public static void main(String[] args) {
        //Времена года, задание 1
        for (Spring spring : Spring.values()) {
            System.out.println(spring);
        }
        //задание 2
        Seasons season = Seasons.WINTER;
        Seasons seasons;

        //задания 3-6
        for (Seasons sea : Seasons.values()) {
            System.out.println(sea + ", средняя температура: " +
                    sea.getTemp() + " градусов, " + sea.getDescription());
        }
    }
}