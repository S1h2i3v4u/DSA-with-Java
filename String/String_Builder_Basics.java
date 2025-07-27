package StringDemo;

/**
 * StringBuilder in Java
 * ----------------------
 * StringBuilder is a mutable sequence of characters. Unlike Strings in Java,
 * which are immutable (cannot be changed once created), StringBuilder allows
 * modifications such as appending, inserting, deleting, or reversing characters
 * without creating new objects.
 * 
 * Commonly used StringBuilder methods:
 * 1. append(String str)           - Appends the specified string to the sequence.
 * 2. setCharAt(int index, char c) - Sets the character at the specified index.
 * 3. insert(int offset, char c)   - Inserts a character at the specified position.
 * 4. deleteCharAt(int index)      - Deletes the character at the specified index.
 * 5. delete(int start, int end)   - Deletes characters from start to end-1.
 * 6. reverse()                    - Reverses the character sequence.
 * 
 * Note: Unlike String, StringBuilder doesn't have methods like toUpperCase(), 
 * toLowerCase(), or concat().
 */

public class StringBuillder_1 {

    public static void main(String[] args) {

        // Example 1: Creating a StringBuilder and modifying characters
        StringBuilder src = new StringBuilder("hello");
        System.out.println("Original: " + src);          // Output: hello

        src.setCharAt(0, 'M');                           // Change 'h' to 'M'
        src.setCharAt(4, 'O');                           // Change 'o' to 'O'
        System.out.println("After setCharAt: " + src);   // Output: MellO

        // Example 2: Appending another string
        src.append("world");                             // Append "world"
        System.out.println("After append: " + src);      // Output: MellOworld

        // Example 3: Inserting a character
        StringBuilder src1 = new StringBuilder("apple");
        src1.insert(3, 's');                              // Insert 's' at index 3
        System.out.println("After insert: " + src1);      // Output: appsle

        // Example 4: Deleting a character at a specific index
        src1.deleteCharAt(4);                             // Delete char at index 4 ('l')
        System.out.println("After deleteCharAt: " + src1); // Output: appsle -> appse

        // Example 5: Reversing the StringBuilder
        src1.reverse();
        System.out.println("After reverse: " + src1);     // Output: esppa

        // Example 6: Deleting a substring (from index 2 to 4)
        StringBuilder src2 = new StringBuilder("orange");
        src2.delete(2, 4);                                // Delete 'an' (index 2 to 3)
        System.out.println("After delete(2, 4): " + src2); // Output: orge
    }
}
