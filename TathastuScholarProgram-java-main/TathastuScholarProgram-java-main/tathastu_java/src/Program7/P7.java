package Program7;
// Write a Java Program to 
//reverse the letters present 
//in the given String.
import java.util.Scanner;
public class P7 {
	public static String reverse(String ts) {
		String ts2="";
		if(ts=="") {
			return "";
		}else {
		for(int i=ts.length()-1;i>=0;i++) {
			ts2+=ts.charAt(i);
		}
		return ts2;}
	}
	public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	String ns="";
	String ts="";
	sc.close();
	for(int i=0; i<s.length()-1;i++) {
		if((s.charAt(i)+"").equals(" ")){
			ns=reverse(ts)+" ";
			ts="";
		}else {
			ts+=s.charAt(i);
		}
	 }
	System.out.println(ns);
}
}