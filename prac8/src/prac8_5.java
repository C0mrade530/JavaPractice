//Задание Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр. При решении этой
//задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
import java.util.Scanner;

public class prac8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("the sum of digits in a number: " + getsum(n));
    }
    public static int getsum(int n) {
        return (n - 1) % 9 + 1;
    }
}
