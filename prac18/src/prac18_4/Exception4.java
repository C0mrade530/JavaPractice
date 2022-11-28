package prac18_4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try{
            i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e ) {
            System.err.println("not int type");
        } catch ( ArithmeticException e ) {
            System.err.println("Attempted division by zero");
        } finally {
            System.out.println("You have entered");
        }
    }
}
