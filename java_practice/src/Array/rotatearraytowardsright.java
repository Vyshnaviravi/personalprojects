package Array;
import java.util.Arrays;
public class rotatearraytowardsright {
public static void main(String[]args)
{
	int[]a= {1,2,3,4,5};
	int k=1;
	k=k%a.length;
	for(int i=0;i<k;i++)
{
		int f=a[a.length-1];
		for(int j=a.length-1; j>0; j--)
		{
			a[j]=a[j-1];
		}
		a[0]=f;
}
	System.out.println(Arrays.toString(a));
}
}

