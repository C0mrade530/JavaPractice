package prac7_6;
//Реализуйте интерфейс в классе ProcessStrings и протестируйте
//работу класса
public class TestProcessStrings {
    public static void main(String[] args) {
        Stringable st = new ProcessStrings("Hello World!");
        System.out.println(st.toString());
    }
}