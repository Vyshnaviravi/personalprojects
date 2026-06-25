package Numbers;

public class sumofcubeeven {
    public static void main(String[] args) {
        int no = 123456;
        int sum = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {   // check even digit
                sum = sum + (rem * rem * rem);
            }

            no = no / 10;
        }

        System.out.println(sum);
    }
}