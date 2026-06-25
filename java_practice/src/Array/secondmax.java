package Array;

public class secondmax {
	    public static void main(String[] args) {
	        int[] a = {2, 5, 1, 4, 3};

	        int max = a[0];
	        int smax = Integer.MIN_VALUE;

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] > max) {
	                smax = max;
	                max = a[i];
	            } else if (a[i] > smax && a[i] != max) {
	                smax = a[i];
	            }
	        }

	        System.out.println("Second Maximum: " + smax);
	    }
	}
