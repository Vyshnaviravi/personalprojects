package Numbers;

public class productofevendigits {
    public static void main(String[] args) {
        int no = 123456;
        int product = 1;
        boolean hasEven = false;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {   // check even digit
                product = product * rem;
                hasEven = true;
            }

            no = no / 10;
        }

        if (hasEven)
            System.out.println(product);
        else
            System.out.println("No even digits");
    }
}