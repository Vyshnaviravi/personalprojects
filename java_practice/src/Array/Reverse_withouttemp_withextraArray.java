package Array;
import java.util.Arrays;
public class Reverse_withouttemp_withextraArray {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5};
		int i=0,j=a.length-1;
		System.out.println(Arrays.toString(a));
		while(i<j) {
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
