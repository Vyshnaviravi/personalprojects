package Strings;

public class Rev_senwithword {
	static String rev(String s) {
		String res ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res+s.charAt(i);
		}
		return res;
	}
public static void main(String[] args) {
	String str = "hi hello how are you";
	System.out.println(str);
	String[] s= str.split(" ");
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.print(rev(s[i]) + " ");
	}
}
}