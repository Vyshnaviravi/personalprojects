package Numbers;
public class firstlargestprime {
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
int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
int maxPrime = -1; // to store largest prime
for (int i = 0; i < a.length; i++) {
        if (isPrime(a[i])) {
            if (a[i] > maxPrime) {
                maxPrime = a[i];
            }
        }
    }
if (maxPrime != -1) {
        System.out.println("Largest Prime Number is: " + maxPrime);
    } else {
        System.out.println("No prime numbers found");
    }
}
}
