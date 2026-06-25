package Array;

public class minelement {
	    public static void main(String[] args) {
	        int[] a = {2, 5, 1, 4, 3};

	        int min = a[0];  // assume first element is min

	        for (int i = 1; i < a.length; i++) {
	            if (a[i] < min) {
	                min = a[i];
	            }
	        }

	        System.out.println("Minimum element: " + min);
	    }
	}
