package prac7_4;
//Разработайте интерфейс MathCalculable, который содержит
//объявления математических функций: возведения в степень и модуль
//комплексного числа. Напишите класс MathFunc,
//который реализует, реализует этот интерфейс.
public class MathFuncTest {
    public static void main(String[] args) {
        MathCalculable num = new MathFunc("5+7i", 5);
        System.out.println(num.toString());
    }
}