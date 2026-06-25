package Strings;

public class Reverse_methodWparameter {
	 private static void Rev(String s) {
        System.out.println(s);
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	res= res + s.charAt(i);
        }
        System.out.println(res);
	}
	public static void main(String[] args) {
		Rev("java");
	}

}