package StringDemo;
import java.util.*;
//substring(i,j)  and substring(i)
//generates all substrings of the string "abcd"
// "abcd" = {a,b,c,d,ab,ac,ad,bc,bd,cd,abc,acd,dcd,abd,}
public class basics_2 {

	public static void main(String[] args) {
	String s1 = "abcd";
		for (int i=0;i<s1.length();i++) {
			for(int j =i+1; j<=s1.length(); j++) {
				System.out.print(s1.substring(i,j)+" ");
			}
		}
  }
}
