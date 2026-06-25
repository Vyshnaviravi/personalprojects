package Strings;

public class Count_charVC {
	public static void main(String[] args) {
		String s = "hii hello";
		System.out.println(s);
		System.out.println(s.replaceAll("", "").length());
		System.out.println(s.replaceAll("[aeiou]", "").length());
		System.out.println(s.replaceAll("[^aeiou]", "").length());
	}
}

