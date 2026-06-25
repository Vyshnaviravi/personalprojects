package Array;
import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 1};

        int i = 0;
        int j = a.length - 1;

        System.out.println(Arrays.toString(a));

        while (i < j) {
            if (a[i] != a[j]) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}