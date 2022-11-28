import java.util.Arrays;

public class prac2_8 {
    public static void main(String[] args) {
        String[] array = {"With", "the", "lights", "out", "it's", "less", "dangerous"};
        System.out.println(Arrays.toString(array));

        int size = array.length;
        String temp; //Переменная, которая будет использоваться при обмене элементов

        for (int i = 0; i < size/2; i++) {
            temp = array[size-i-1];
            array[size-i-1] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}