package Strings;

public class Conversions {
	public static void main(String[] args) {
		
		int x = 'a';
		System.out.println(x);
		
		char y = 65;
		System.out.println((char)y);
		
		int z = 'a';
		System.out.println((char)(z-32));
		
		String s = "hello";
		char F = (char)(s.charAt(0)-32);
		System.out.println(F + s.substring(1));
		
		String str = "Method";
		System.out.println(str);
		
		String res = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') 
			{
				res = res + (char)(ch + 32);
			}
			else 
			{
				res = res + (char)(ch - 32);
			}
		}
		
		System.out.println(res);
	}
}