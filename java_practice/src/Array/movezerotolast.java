package Array;
import java.util.Arrays;
public class movezerotolast {
	public static void main(String[] args) {

        int[] a = {1, 0, 2, 0, 3, 0, 4};
        int[] b = new int[a.length];

        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[j++] = a[i];
            }
        }

        System.out.println(Arrays.toString(b));
    }
}

