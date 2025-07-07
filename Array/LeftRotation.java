package Demo_Array;
import java.util.Arrays;
//Rotation of Array (Left)
public class LeftRotation {
	
	   public static void rotateLeft(int[] arr, int k) {
	        int n = arr.length;
	        k = k % n; 

	        reverse(arr, 0, k - 1);
	        reverse(arr, k, n - 1);
	        reverse(arr, 0, n - 1);
	    }
	    public static void reverse(int[] arr, int start, int end) {
	
	    	while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int k = 2; 

        rotateLeft(arr, k);
        System.out.println("Left rotated array by " + k + ": " + Arrays.toString(arr));
    }

    
 
}
