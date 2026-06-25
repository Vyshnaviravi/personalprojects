package Strings;

public class Str_NextChar {

	public static void main(String[] args) {

		String s = "hello";
		String res = "";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			ch = (char) (ch + 1);

			res = res + ch;
		}

		System.out.println("Output : " + res);
	}
}