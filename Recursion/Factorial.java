package Demo;
import java.util.*;

/*
 * factorial(4)
→ 4 * factorial(3)
→ 4 * (3 * factorial(2))
→ 4 * (3 * (2 * factorial(1)))
→ 4 * (3 * (2 * 1))
→ 4 * 3 * 2 * 1 = 24

 */

public class Recursion_1 {
	

public static long factorial(int num) {         // Factorial Method (Using Recursion)
	if (num == 0 || num == 1) {
		return 1;
	}
	return num * factorial(num-1);
	
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		
		long fact = factorial(num);
		System.out.println("Factorial of number " + num + " is : " +fact);

	}

}
