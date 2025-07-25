package StringDemo;
// reverse string using StringBuilder
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Suryawanshi";
		
		String reversed = new StringBuilder(s1).reverse().toString();
		
		System.out.println("original String : "+s1);
		System.out.println("Reversed String : "+reversed);

	}

}
