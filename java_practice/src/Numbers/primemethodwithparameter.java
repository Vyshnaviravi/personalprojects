package Numbers;
public class primemethodwithparameter {
	    // Method with return type
	    static boolean isPrime(int no) {
	        if (no <= 1) {
	            return false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(no); i++) {
	                if (no % i == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int no = 13;

	        if (isPrime(no)) {
	            System.out.println(no + " is Prime");
	        } else {
	            System.out.println(no + " is not a Prime");
	        }
	    }
	}


