package Demo_Array;
// Find the largest element in the array
import java.util.*;

public class Demo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2, 4, 3, 5, 7, 4, 55, 6, 77, 46, 83, 96, 45, 2, 33, 77};

        int max = arr[0];                //  maximum initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("Largest Element in the Array is: " + max);
    }
}

