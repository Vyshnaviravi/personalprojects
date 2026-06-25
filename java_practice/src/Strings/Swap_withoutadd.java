package Strings;
import java.util.Scanner;

public class Swap_withoutadd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a= sc.nextInt();
		System.out.println("Enter b");
		int b= sc.nextInt();
		System.out.println("Enter c");
		int c= sc.nextInt();
		a = a*b*c;
		b = a/(b*c);
		c = a/(b*c);
		a = a/(b*c);	
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
}