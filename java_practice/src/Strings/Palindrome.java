package Strings;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res+s.charAt(i);
		}
		if(s.equals(res))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}