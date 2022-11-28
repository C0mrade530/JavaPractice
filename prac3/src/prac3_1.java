import java.util.Arrays;
import java.util.Random;
public class prac3_1 {
    public static void main(String[] args){
        int size = (int) ((Math.random()+1)*5);
        System.out.println("Generated size : " + size);
        double[] array1 = new double[size];
        for (int i = 0; i < size; i++){
            array1[i] = ((double)(Math.random() * 30));
        }
        System.out.println("Unsorted array (Math.random) - " + Arrays.toString(array1));
        Random random = new Random();
        double[] array2 = random.doubles(size, 1,100).toArray();
        System.out.println("Unsorted array (class Random) - " + Arrays.toString(array2));

        bubbleSort(array1);
        bubbleSort(array2);
        System.out.println("Sorted array (Math.random) - " + Arrays.toString(array1));
        System.out.println("Sorted array (class Random) - " + Arrays.toString(array2));
    }
    public static void bubbleSort(double[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    var swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
