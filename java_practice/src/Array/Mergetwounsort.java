package Array;
import java.util.Arrays;
public class Mergetwounsort {
public static void main(String[]args)
{
	int[]a1= {1,2};
	int[]a2= {6,3,4,5};
	int[]t=new int[a1.length+a2.length];
	System.arraycopy(a1, 0, t, 0,a1.length);
	System.arraycopy(a2, 0, t, a1.length, a2.length);
	Arrays.sort(t);
	System.out.println(Arrays.toString(t));
}
}

