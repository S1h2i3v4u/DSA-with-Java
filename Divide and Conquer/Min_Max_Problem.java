package daa;

public class Min_Max_Problem {

    static class MinMax {
        int min;
        int max;
    }

 // Recursive function using Divide and Conquer
    public static MinMax findMinMax(int[] arr, int low, int high) {
        MinMax result = new MinMax();

       
        if (low == high) {
            result.min = arr[low];
            result.max = arr[low];
            return result;
        }

      
        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                result.min = arr[low];
                result.max = arr[high];
            } else {
                result.min = arr[high];
                result.max = arr[low];
            }
            return result;
        }

        int mid = (low + high) / 2;

        MinMax left = findMinMax(arr, low, mid);
        MinMax right = findMinMax(arr, mid + 1, high);

        result.min = Math.min(left.min, right.min);
        result.max = Math.max(left.max, right.max);

        return result;
    }

    public static void main(String[] args) {
          //int[] array = {15};
         //int[] array = {15, 3};
        int[] array = {15, 3, 9, 5, 7, 12, 8, 6, 4, 10};

        MinMax result = findMinMax(array, 0, array.length - 1);

        System.out.println("Minimum value: " + result.min);
        System.out.println("Maximum value: " + result.max);
    }
}
