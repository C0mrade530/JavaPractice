//3. Задание от A до B
//Даны два целых числа A и В (каждое в отдельной строке). Выведите все
//числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
//убывания в противном случае.

import java.util.Scanner;

public class prac8_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = scanner.nextInt();
        System.out.println("Enter B number: ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Sequence: ");
            for (int i = a; i <= b; i++)
            {//begin for loop i
                System.out.print(i + " ");
            }
        }
        if (b < a) {
            System.out.println("Sequence: ");
            for (int j = a; j >= b; j--) {
                System.out.print(j + " ");
            }
        }
        if (a == b) {
            System.out.println("Pls, enter different num! ");
        }
    }
}
