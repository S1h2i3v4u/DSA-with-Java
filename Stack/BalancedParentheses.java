package StringDemo;
import java.util.*;
// {([])} = true
// ({)]} = false
public class basics_5 {

	    public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	                if (stack.isEmpty()) return false;

	                char top = stack.pop();

	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty(); 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Parentheses :");
	        String input = sc.nextLine();

	        if (isBalanced(input)) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	    }
	}
