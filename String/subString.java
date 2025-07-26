package StringDemo;
import java.util.*;
//extract a substring from a given string based on the start and end index.
//helloworld = 3,7 = lowo
public class SubString_Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the string :");
        String S = in.next();   

        System.out.print("Enter the start point:");
        int start = in.nextInt();  

        System.out.print("Enter the end point :");
        int end = in.nextInt();    
        
        System.out.println(S.substring(start, end));  

        in.close();
    }
}
