package Demo_Array;
import java.util.*;
//find two numbers that sum to target
public class  Sum_Two{

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the target number :");
    	int target = sc.nextInt();
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println("Pair: " + num[i] + " + " + num[j] + " = " + target);
                    return;
                }
            }
        }

        System.out.println("No pair found.");
    }
}
