package Strings;

public class Remove_adjwordinSen {
	public static void main(String[] args) {
		String str = "hi hi how how rrr uuu";
		String[] s = str.split(" ");

		for (int i = 0; i < s.length - 1; i++) {
			if (!s[i].equals(s[i + 1])) {
				System.out.println(s[i]);
			}
		}

		System.out.println(s[s.length - 1]);
	}
}