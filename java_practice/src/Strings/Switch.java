package Strings;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first value");
		int a=s.nextInt();
		System.out.println("enter second value");
        int b=s.nextInt();
        System.out.println("enter the operator to perform");
        char c=s.next().charAt(0);
        switch(c) {
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':System.out.println(a/b);
        break;
        default:System.out.println("invalid operator");
        }
	}

}