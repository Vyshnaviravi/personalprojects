package Strings;

public class Remove_noinstring {
	public static void main(String[] args) {
		String s = "h12i he1l23o";
		System.out.println(s);
		System.out.print(s.replaceAll("[0-9]", ""));
	}

}