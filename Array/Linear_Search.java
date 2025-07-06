package Demo_Array;
// Linear Search : find the element 'x' in the array
import java.util.*;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 3, 5, 7, 4, 55, 6, 77, 46, 83, 96, 45, 2, 33,77};

        System.out.println("Enter the Number for search:");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                found = true;
                System.out.println("Element found at index: " + i);
//                break;                                                //use for to find single occurrence 
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
