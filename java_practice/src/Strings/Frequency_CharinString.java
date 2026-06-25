package Strings;

public class Frequency_CharinString {
	public static void main(String[] args) {
		String s = "abbcccdeef";
		int[] a = new int[127];
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			a[ch]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println((char)i +" " +a[i]);
			}
		}
	}

}