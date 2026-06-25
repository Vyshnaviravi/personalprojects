package Numbers;
class primenumbersinarray {
    // method with return type
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

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                System.out.println(a[i] + " is Prime");
            }
        }
    }
}