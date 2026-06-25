package Strings;

public class Str_UpperToLower {

	public static void main(String[] args) {

		String str = "METHOD";
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				res = res + (char)(ch + 32);
			} 
			else {
				res = res + ch;
			}
		}

		System.out.println("Output : " + res);
	}
}