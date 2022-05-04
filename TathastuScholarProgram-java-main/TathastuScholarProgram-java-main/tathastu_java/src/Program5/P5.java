package Program5;
// Write a Java program to calculate 
// Permutation and Combination of 2 numbers
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 (n): ");
		int n=sc.nextInt();
		System.out.println();
		System.out.print("Enter Number 2 (r): ");
		int r=sc.nextInt();
		sc.close();

		System.out.println();
		
		
		System.out.println("Permutation: "+ fact(n)/(fact(n-r)));
		System.out.println("Combination: "+fact(n)/(fact(n-r)*fact(r)));

		
		

	}
	public static long fact(int n) {
		if (n==1 || n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
		
	}
}
