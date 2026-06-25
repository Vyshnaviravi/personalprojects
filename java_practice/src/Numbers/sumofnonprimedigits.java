package Numbers;

public class sumofnonprimedigits {
    public static void main(String[] args) {
        int no = 123456789;
        int sum = 0;

        while (no != 0) {
            int rem = no % 10;

            if (!isPrime(rem)) {   // non-prime check
                sum += rem;
            }

            no = no / 10;
        }

        System.out.println(sum);
    }

    // method to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}