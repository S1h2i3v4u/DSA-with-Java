package Demo;
import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
       
        if (start >= end) {                         // Base case: If start >= end, it's a palindrome
            return true;
        }                                               
        if (str.charAt(start) != str.charAt(end)) {      // If characters at start and end are different, not a palindrome
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();    // Remove spaces and convert to lowercase

        
  /*
   * isPalindrome("madam", 0, 4)
  
Call No. 	Start  End	   str[start]  	str[end]	      Result
1	          0	   4	          'm'	      'm'          Same → continue
2	          1	   3	          'a'	      'a'          Same → continue
3	          2	   2	          'd'	      'd'          Base case → true
      
   */
 if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }

        sc.close();
    }
}
