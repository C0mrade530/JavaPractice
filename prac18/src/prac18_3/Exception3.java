package prac18_3;
import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try{
            i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (Exception e ) {
            System.err.println("input error");
        }
    }
}
