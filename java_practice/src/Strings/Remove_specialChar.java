package Strings;

public class Remove_specialChar {
	public static void main(String[] args) {
		String s = "G23good*& M56morni$%ng";
		System.out.println(s);
		System.out.println(s.replaceAll("[^a-z]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
	}

}