package StringDemo;
import java.util.*;
/*
STRING METHODS :

1. length()
2. charAt(int index)
3. indexOf(String str)
4. contains(CharSequence s)
5. compareTo(String anotherString)
6. equals(Object anObject)
7. concat(String str)
8. toLowerCase()
9. toUpperCase()
10.split(String regex)
11.isEmpty()
12.replace(char oldChar, char newChar)

*/
public class basics_1 {

	public static void main(String[] args) {

		// 1. String declaration and basic print
		System.out.println("helloooo");  //string simple example
		String str = "Shivani";         //string in variable
		System.out.println("String stored in variable: " +str);
		
		Scanner sc = new Scanner(System.in);      //take input as a string
		
		System.out.print("Enter String :");
		String s2 = sc.nextLine();   // input with spaces allowed
//		String s1 = sc.next();      // input without spaces
		System.out.println("you entered :" + s2);
		System.out.println("Length of s2 (including spaces): " +s2.length());       //space also count
		
		System.out.println("Character at index 3: " + s2.charAt(3));             //any index char
		System.out.println("Index of character 'i': " +s2.indexOf("i"));          //any char index
		System.out.println("Does it contain 'ani'? " + s2.contains("ani"));      //true  shivani = ani
		 
		// 2. String comparison using compareTo()
		String x1 = "shiv";
		String x2 = "shiv";
		String x3 = "shi";
		
		System.out.println(x1.compareTo(x2));     //output = 0 - true (both are same)
		System.out.println(x1.compareTo(x3));     //output = 1 - false (shiv > shi)
		
		String x4 = "dog";
		String x5 = "cat";
		System.out.println(x4.compareTo(x5));    //dog > cat = 1
		System.out.println(x5.compareTo(x4));    //cat < dog = -1
		
		String x6 = "apple";
		String x7 = "cat";
		System.out.println(x6.compareTo(x7));   //apple < cat = -2   (a-c = -2)
		System.out.println(x7.compareTo(x6));   //cat > apple = 2    (c-a = 2)
		
		// 3. String comparison using equals()
		System.out.println(x6.equals(x7));        //false   //in string don't use ==
		
		// 4. String concatenation
		System.out.println(x6.concat(x7));       //applecat
		System.out.println("Concatenation result: " + x6 + x7 + 10 + 's' + (4 + 5));   //string are concat (+)
		
		// 5. Case conversion
		// below methods do not modify original string since strings are immutable
		System.out.println("Lowercase of x6: " + x6.toLowerCase());               // convert to lowercase
		System.out.println("Uppercase of x6: " + x6.toUpperCase());               // convert to uppercase
		
		// 6. Splitting a string
		// splitting string by space
		String[] parts = s2.split(" ");
		System.out.println("Splitted parts:");
		for (String part : parts) {
			System.out.println(part);
		}
		
		// 7. String utility methods
		String x8 = " ";
		System.out.println("Is x8 empty? : " + x8.isEmpty());     // check if string is empty (false for " ")
		
		System.out.println("x6 after replace 'l' with 's': " +x6.replace('l', 's'));   // replace characters (though 'l' not present in "apple")
		
	}
}

