package Strings;

public class RevStr_withoutinbuilt {
public static void main(String[] args) {
	String s = "java";
	System.out.print(s);
	char[] x = s.toCharArray();
	int i=0;
	int j=x.length-1;
	while(i<j)
	{
		char temp = x[i];
		x[i] = x[j];
		x[j] = temp;
		i++;
		j--;
	}
	System.out.print(x);
}
}