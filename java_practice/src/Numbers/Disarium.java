package Numbers;
public class Disarium {
public static void main(String[] args) {
	int no=135, n=no,copy=no;
			int count=0,sum=0;
	while(no!=0)
	{
		count++;
		no=no/10;
	}
	while(no!=0)
	{
		int rem=n%10;
		sum+=Math.pow(rem, count);
		count++;
		n/=10;
	}
	if(sum==copy)
	{
		System.out.println("Disarium");
	}
	else {
		System.out.println("Not a disarium");
	}
}
}
