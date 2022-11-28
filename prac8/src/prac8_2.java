//2. Задание от 1 до n
//Дано натуральное число n. Выведите все числа от 1 до n
import java.util.Scanner;
public class prac8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("All numbers from 1 to " + n + " : ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
