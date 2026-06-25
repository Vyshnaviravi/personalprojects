package Strings;

public class Str_FirstCharUpper {

	public static void main(String[] args) {

		String s = "hello how are you";

		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {

			char ch = str[i].charAt(0);
			ch = (char) (ch - 32);

			String res = ch + str[i].substring(1);

			System.out.print(res + " ");
		}
	}
}