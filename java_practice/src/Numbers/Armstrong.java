package Numbers;
public class Armstrong {
public static void main(String[] args) {
	int no=153,n=no,copy=no;
	int count=0,sum=0;
	while(no!=0)
	{
		count++;
		no=no/10;
	}
	while(n!=0)
	{
		int rem=n%10;
		sum+=Math.pow(rem, count);
		n/=10;
	}
	if(sum==copy)
	{
		System.out.println("Arm strong");
	}
	else {
		System.out.println("Not a Arm Strong");
	}
}
}
