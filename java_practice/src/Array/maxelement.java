package Array;

public class maxelement {
	    public static void main(String[] args) {
	        int[] a = {2, 5, 1, 4, 3};

	        int max = a[0];  // assume first element is max

	        for (int i = 1; i < a.length; i++) {
	            if (a[i] > max) {
	                max = a[i];
	            }
	        }

	        System.out.println("Maximum element: " + max);
	    }
	}
