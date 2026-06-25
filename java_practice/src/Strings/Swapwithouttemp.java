package Strings;
import java.util.Scanner;

public class Swap_withouttemp {
	public static void main(String[] args) {
			System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}