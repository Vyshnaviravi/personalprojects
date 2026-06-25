package Numbers;

public class strongnumber {
	static int fact(int n) {
		int fact=1;
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
	}
	
public static void main(String[] args) {
	
	int  n=145;
	int sum=0;
	int temp=n;
	while(temp>0)
	{
		int rem=temp%10;
		sum=sum+fact(rem);
		temp=temp/10;
	}
	if(sum==n)
		{
			System.out.println(n+" is a strong num");
		}
		else 
		{
			System.out.println(n+" is not a Strong num");
		}
}
}
