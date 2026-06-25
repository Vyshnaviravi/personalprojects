package Numbers;
public class happynumber {
	public static int Summation (int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum+=(rem*rem);
			no/=10;
		}
		return sum;
	}
	public static void main (String[]args)
	{
		int no=19;
		while(no>9)
		{
			no=Summation(no);
		}
		if(no==1 || no==7)
		{
			System.out.println("Happy Num");
		}
		else {
			System.out.println("Not a happy num");
		}
	}

}
