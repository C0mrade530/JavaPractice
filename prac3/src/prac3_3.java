import java.util.Arrays;
import java.util.Random;
public class prac3_3 {
    public static void main(String[] args) {
        int size = 4;
        Random random = new Random();
        int[] array = random.ints(size, 10, 100).toArray();
        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = 0; i < size; i++){
            if ((array[i] < array[i+1]) & (array[i+1] < array[i+2]) & (array[i+2] < array[i+3])){
                System.out.println("Строго возрастающая последовательность");
                break;
            }
            else {
                System.out.println("Не является строго возрастающей последовательностью");
                break;
            }
        }
    }
}
