package Numbers;

public class countodd {
    public static void main(String[] args) {
        int no = 538274;
        int oddCount = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 != 0) {
                oddCount++;
            }

            no = no / 10;
        }

        System.out.println("Odd digits: " + oddCount);
    }
}