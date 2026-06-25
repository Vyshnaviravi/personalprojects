package Numbers;

public class countdigits {
	    public static void main(String[] args) {
	        int no = 538274;
	        int count = 0;

	        while (no != 0) {
	            no = no / 10;
	            count++;
	        }

	        System.out.println("Total digits: " + count);
	    }
	}
