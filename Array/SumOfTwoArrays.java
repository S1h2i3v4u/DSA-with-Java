package Demo_Array;
// Sum of two arrays
public class SumOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7};
 
        int sum = arr1[3] + arr2[3];                // Sum of specific elements
        System.out.println("Sum of " + arr1[3] + " and " + arr2[3] + " is: " + sum);

        int[] arr3 = new int[arr1.length];

       
        System.out.print("Element-wise sum of arrays: ");
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];            // element-wise sum
            System.out.print(arr3[i] + " ");
        }
    }
}
