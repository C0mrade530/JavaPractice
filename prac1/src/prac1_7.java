import java.util.Scanner;
public class prac1_7 {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int fac = 0;
        fac = (int) factorial(n);
        System.out.println(fac);
    }
}
