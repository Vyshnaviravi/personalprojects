package Numbers;
public class nxtprimenumber {
	public static void main(String[]args) {
	int n=7; {
	for(int j=n+1;j<=100;j++) {
		n=j;
		boolean f=true;
		if(n<1)
		{
			f=false;
		}
		else {
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0) {
					f=false;
					break;
				}
			}
		}
		if(f) {
			System.out.println(n+" is a prime");
			break;
		}
		}
	}

}
}
