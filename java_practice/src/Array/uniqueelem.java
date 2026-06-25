package Array;
import java.util.Arrays;
public class uniqueelem {
	public static void main(String[] args) {

        int[] a = {1, 2, 1, 3, 2, 4, 3, 6, 5};

        for (int i = 0; i < a.length; i++) {

            boolean f = true;

            for (int j = 0; j < a.length; j++) {

                if (i != j && a[i] == a[j]) {
                    f = false;
                    break;
                }
            }

            if (f) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
