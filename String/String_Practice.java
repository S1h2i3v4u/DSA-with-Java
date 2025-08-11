package StringDemo;
import java.util.*;

public class String_Practice {
    public static void main(String[] args) {
        String s = "shivani@123";

        // 1) Length
        System.out.println("Length: " + s.length());

        // 2) Upper / Lower
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // 3) Reverse (using StringBuilder)
        System.out.println("Reverse: " + new StringBuilder(s).reverse());

        // 4) First & Last
        System.out.println("First char: " + s.charAt(0));
        System.out.println("Last char: " + s.charAt(s.length() - 1));

        // 5) Char at index 3
        System.out.println("Char at index 3: " + s.charAt(3));

        // 6) Substring "iva" if present
        if (s.contains("iva")) {
            System.out.println("6) Substring \"iva\": " + s.substring(s.indexOf("iva"), s.indexOf("iva") + 3));
        } else {
            System.out.println("6) Substring \"iva\" not found");
        }
        // 7) Remove first & last
        System.out.println("Remove first & last: " + s.substring(1, s.length() - 1));

        // 8) Contains "ani"
        System.out.println("Contains 'ani': " + s.contains("ani"));

        // 9) indexOf("vi")
        System.out.println("Index of 'vi': " + s.indexOf("vi"));

        // 10) Count of 'i'
        long countI = s.chars().filter(ch -> ch == 'i').count();
        System.out.println("Count of 'i': " + countI);

        // 11) Replace "shi" -> "pra"
        System.out.println("Replace 'shi'->'pra': " + s.replaceFirst("shi", "pra"));

        // 12) Remove vowels
        System.out.println("Remove vowels: " + s.replaceAll("[aeiouAEIOU]", ""));

        // 13) Palindrome check
        System.out.println("Is palindrome: " + s.equals(new StringBuilder(s).reverse().toString()));

        // 14) Sorted characters
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted chars: " + new String(arr));

        // 15) Count vowels, consonants, digits, specials
        int v = 0, c = 0, d = 0, sp = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) >= 0) v++; else c++;
            } else if (Character.isDigit(ch)) d++;
            else sp++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c + ", Digits: " + d + ", Specials: " + sp);

        // 16) Username before @
        System.out.println("Username before @: " + (s.contains("@") ? s.split("@")[0] : "No @ found"));

        // 17) Numbers after @
        String afterAt = s.contains("@") ? s.split("@")[1] : "";
        String digitsOnly = afterAt.replaceAll("\\D", "");
        System.out.println("Numbers after @: " + digitsOnly);

        // 18) Sum of digits
        int sum = digitsOnly.chars().map(ch -> ch - '0').sum();
        System.out.println("Sum of digits: " + sum);
    }
}
