package Strings;

public class Str_LowerToUpper {

	public static void main(String[] args) {

		String str = "method";
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				res = res + (char) (ch - 32);
			} else {
				res = res + ch;
			}
		}

		System.out.println("Output : " + res);
	}
}