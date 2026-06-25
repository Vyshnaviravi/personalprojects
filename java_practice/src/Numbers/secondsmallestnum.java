package Numbers;

public class secondsmallestnum {
	    public static void main(String[] args) {
	        int no = 538274;

	        int smallest = 9;
	        int secondSmallest = 9;

	        while (no != 0) {
	            int rem = no % 10;

	            if (rem < smallest) {
	                secondSmallest = smallest;
	                smallest = rem;
	            } 
	            else if (rem < secondSmallest && rem != smallest) {
	                secondSmallest = rem;
	            }

	            no = no / 10;
	        }

	        System.out.println("2nd Smallest digit: " + secondSmallest);
	    }
	}

