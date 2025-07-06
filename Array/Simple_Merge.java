package Demo_Array;
//simple merge (concatenate two arrays)
public class Demo6 {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7};

        int[] arr3 = new int[arr1.length + arr2.length];

       
        for (int i = 0; i < arr1.length; i++) {       // Copy elements of arr1 into arr3
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {       // Copy elements of arr2 into arr3 
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.print("Concatenated array is : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
