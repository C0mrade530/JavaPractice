public class prac1_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println("Summ of array = " + sum);
        System.out.println("average arif = " + sum/arr1.length);
    }
}
