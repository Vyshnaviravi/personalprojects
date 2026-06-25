package Array;

import java.util.Arrays;

public class operonarrayelem {
	
public static void main(String[]args)
	{
		int[]a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			 System.out.println(a[i]+"");
		}
		System.out.println("\n***************");
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println("***");
		{
			System.out.println(Arrays.toString(a));
		}
}
}
