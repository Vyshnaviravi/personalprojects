package Strings;

public class Rev_wordinsentence {
	static String Rev(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res + s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String str="hi hello how are you";
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(Rev(s[i]) + " ");
		}
	}

}