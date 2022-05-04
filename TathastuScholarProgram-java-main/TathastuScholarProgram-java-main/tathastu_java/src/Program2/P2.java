package Program2;

//Write a Java program to calculate 
//Fibonacci Series up to n numbers.
//done
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int previous=0, next=1, temp;
		System.out.println(0);
		while(next<=n) {
			System.out.println(next);
			temp=next;
			
			next=previous+next;
			previous=temp;
		}
		
	}

}
