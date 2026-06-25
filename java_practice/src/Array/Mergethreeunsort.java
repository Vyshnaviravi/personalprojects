package Array;
import java.util.Arrays;
public class Mergethreeunsort {
  public static void main(String[] args) {
	  int[] a1 = {1, 2};
	  int[] a2 = {6, 3, 4, 5};
	  int[] a3 = {8, 9, 7};
	  int[] t = new int[a1.length + a2.length + a3.length];
	  System.arraycopy(a1, 0, t, 0, a1.length);
	  System.arraycopy(a2, 0, t, a1.length, a2.length);
	  System.arraycopy(a3, 0, t, a1.length + a2.length, a3.length);
	  Arrays.sort(t);
	  System.out.println(Arrays.toString(t));
	}
}