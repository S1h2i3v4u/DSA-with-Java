package Demo_Array;
// Find second largest element in array
public class Second_Max_Number {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 4, 55, 6, 77, 46, 83, 96, 45, 2, 33, 77};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } 
            else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Second largest: " + smax);
    }
}
