package Program3;

//Write a Java program to
//calculate a Factorial of a number.
//done
import java.util.Scanner;



public class P3 {
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(fact(n));
		sc.close();
		
	}
	
	public static int fact(int n) {
		if (n==1 || n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
		
	}
	
	
	
}
