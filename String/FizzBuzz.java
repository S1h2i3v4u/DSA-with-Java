package StringDemo;
 /*print numbers from 1 to 30 with the following rules:
   Print "Fizz" for multiples of 3 (but not 5),
   Print "Buzz" for multiples of 5 (but not 3),
   Print "FizzBuzz" for multiples of both 3 and 5,
   Otherwise, print the number.
  */
public class FizzBuzz {
	
	 public static String getFizzBuzzValue(int i) {
	        if (i % 3 == 0 && i % 5 == 0) {
	            return "FizzBuzz";
	        } else if (i % 3 == 0) {
	            return "Fizz";
	        } else if (i % 5 == 0) {
	            return "Buzz";
	        } else {
	            return Integer.toString(i);
	        }
	    }

	    public static void main(String[] args) {
	        for (int i = 1; i <= 30; i++) {
	            System.out.println(getFizzBuzzValue(i));
	        }
	    }
	}
