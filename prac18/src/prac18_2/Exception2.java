package prac18_2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        } catch (NumberFormatException e) {
            System.err.println("not int type");
        } catch (ArithmeticException e) {
            System.err.println("Attempted division by zero");
        }
    }
}
