package Numbers;

public class factorial {
public static void main(String[] args) {
	int no=6;
	int fact=1;
	if(no==0 || no==1)
	{
		System.out.println(1);
		return;
	}
	for(int i=no;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
