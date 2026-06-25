package Array;

public class thirdmax {
	    public static void main(String[] args) {
	        int[] a = {2, 5, 1, 4, 3};

	        int max = Integer.MIN_VALUE;
	        int smax = Integer.MIN_VALUE;
	        int tmax = Integer.MIN_VALUE;

	        for (int i = 0; i < a.length; i++) {

	            if (a[i] > max) {
	                tmax = smax;
	                smax = max;
	                max = a[i];
	            }
	            else if (a[i] > smax && a[i] != max) {
	                tmax = smax;
	                smax = a[i];
	            }
	            else if (a[i] > tmax && a[i] != smax && a[i] != max) {
	                tmax = a[i];
	            }
	        }

	        System.out.println("Third Maximum: " + tmax);
	    }
	}
