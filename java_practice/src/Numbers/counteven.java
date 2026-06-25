package Numbers;

public class counteven {
    public static void main(String[] args) {
        int no = 538274;
        int evenCount = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {
                evenCount++;
            }

            no = no / 10;
        }

        System.out.println("Even digits: " + evenCount);
    }
}