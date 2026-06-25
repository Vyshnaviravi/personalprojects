package Numbers;
public class secondsmallestprime {public secondsmallestprime() {
	// TODO Auto-generated constructor stub
}static boolean isPrime(int no) {
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

    int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < a.length; i++) {
        if (isPrime(a[i])) {

            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } 
            else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
    }

    if (secondSmallest != Integer.MAX_VALUE) {
        System.out.println("2nd Smallest Prime Number is: " + secondSmallest);
    } else {
        System.out.println("Not enough prime numbers");
    }
}
}

