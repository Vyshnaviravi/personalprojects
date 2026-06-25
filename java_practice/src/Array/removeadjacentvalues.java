package Array;
import java.util.Arrays;

public class removeadjacentvalues {
public static void main(String[]args)
{
	int[]a= {1,1,2,3,3,4,4,5,5};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			System.out.print(a[i]+" ");
		}
	}
	System.out.println(a[a.length-1]);
}
}
