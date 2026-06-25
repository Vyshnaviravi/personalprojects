package Strings;

public class Remove_Upperlowercase {
	public static void main(String[] args) {
		String s = "HhiI HheELlLlo";
		System.out.println(s);
		System.out.println(s.replaceAll("[A-Z]", ""));
		
		String a = "HhiI HheELlLOo";
		System.out.println(a);
		System.out.println(a.replaceAll("[a-z]", ""));
	}

}