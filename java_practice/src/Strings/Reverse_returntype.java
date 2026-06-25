package Strings;

public class Reverse_returntype {
	static String rev(String s) {
		System.out.println(s);
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res+s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String p = rev("java");
		System.out.println(p);
	}

}