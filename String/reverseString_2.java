package StringDemo;
// reverse string using loop
public class reverseString2 {

	public static void main(String[] args) {
		String s1 = "Earth";
        String reversed = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);
        }

        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + reversed);
    }
}
