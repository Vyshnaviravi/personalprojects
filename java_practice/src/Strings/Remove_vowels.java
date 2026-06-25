package Strings;

public class Remove_vowels {
	public static void main(String[] args) {
		String s = "hello good morning";
		System.out.println(s);
		System.out.print(s.replaceAll("[aeiouAEIOU]", ""));
		System.out.print(s.replaceAll("[^aeiouAEIOU]", ""));
	}

}