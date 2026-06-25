package Numbers;

public class sumofproductofodddidgits {
    public static void main(String[] args) {
        int no = 123456;
        int product = 1;
        boolean hasOdd = false;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 != 0) {   // check odd digit
                product = product * rem;
                hasOdd = true;
            }

            no = no / 10;
        }

        if (hasOdd)
            System.out.println(product);
        else
            System.out.println("No odd digits");
    }
}