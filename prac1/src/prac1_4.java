import java.util.Arrays;
import java.util.Scanner;
public class prac1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of array elements ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array of " + size + " elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print ("Inserted array: ");
        System.out.println(Arrays.toString(arr));
        int i = 0, sum = 0;

        while (i < size) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println(sum + " (while)");

        int j = 0, sum2 = 0;

        do {
           sum2 = sum2 + arr[j];
           j++;
        }while (j<size);
        System.out.println(sum2 + " (do while)");

        int max = 0, min = arr[0] + 1;
        for (int g = 0; g < size; g++) {
            if (arr[g] > max){
                max = arr[g];
            }
            if (arr[g] < min){
                min = arr[g];
            }
        }
        System.out.println("Max el of array = " + max);
        System.out.println("Min el of array = " + min);
    }
}
