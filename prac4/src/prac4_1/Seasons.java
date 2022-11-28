package prac4_1;

public enum Seasons {
    WINTER(-15), SPRING(8), SUMMER(25){
        @Override
        public String getDescription() {
            return "Кайф. Тёплое время года";
        }
    }, AUTUMN(10);

    private double temp;

    public double getTemp() {
        return temp;
    }

    Seasons(double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return "Брр... Одевайтесь теплее. Холодное время года";
    }

}