package StringDemo;
/*interning = Interning in Java means storing only one copy of each unique string 
in a special memory area called the String Pool. /save memory
x = "hello"    y = "hello"  - both x and y point to the same "hello" string, 
no 2 "hello" memory store
avoid interning using the new keyword
*/
public class basics_3 {

	public static void main(String[] args) {
		
		String x = "hello";
		String y = "hello";
		
		String z= new String("hello");    
		
	 System.out.println(x == y);           //true   x == y → same memory location
	 System.out.println(x == z);          //false - x == z → different memory locations
	 System.out.println(x.equals(z));    //true     because .equals() compares content, not reference.
	}

}
