package Program4;
// Write a Java program to find out whether 
// the given String is Palindrome or not.
import java.util.Scanner;
public class P4 {
		public static void main (String [] args) {
			Scanner sc =new Scanner(System.in);
			String ns="";
			String s=sc.nextLine();
			sc.close();
			for(int i=s.length()-1;i>=0;i--) {
				ns+=s.charAt(i);
			}
			System.out.println(ns);

			if(s.equalsIgnoreCase(ns)) {
				System.out.println("String is a Palindrome");
			}else {
				System.out.println("String is not a Palindrome");

			}
			
			
		}
}
