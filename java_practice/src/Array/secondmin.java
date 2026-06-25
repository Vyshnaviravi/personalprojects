package Array;
public class secondmin {
	    public static void main(String[] args) {
	        int[] a = {2, 5, 1, 4, 3};

	        int min = Integer.MAX_VALUE;
	        int smin = Integer.MAX_VALUE;

	        for (int i = 0; i < a.length; i++) {

	            if (a[i] < min) {
	                smin = min;
	                min = a[i];
	            }
	            else if (a[i] < smin && a[i] != min) {
	                smin = a[i];
	            }
	        }

	        System.out.println("Second Minimum: " + smin);
	    }
	}
