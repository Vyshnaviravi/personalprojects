package Strings;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a");
		int a=s.nextInt();
		System.out.println("enter b");
		int b=s.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
	}

}