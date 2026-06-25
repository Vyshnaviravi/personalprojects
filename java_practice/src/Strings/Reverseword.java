package Strings;
import java.util.Scanner;

public class Reverseword {
	public static void reverse(String s) {
	String res="";
	for(int i=s.length()-1;i>=0;i--)
	{
		res = res+s.charAt(i);
	}
	System.out.println(res);
}
	public static void main(String[] args) {
         reverse("hello");		
		
	}

}