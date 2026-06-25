package Array;
import java.util.Arrays;
public class moveposithennega {
	public static void main(String[] args) {

        int[] a = {1, -1, 2, -2, 3, -3};
        int j = 0;

        // move positives first
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[j++] = a[i];
            }
        }

        // then negatives
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[j++] = a[i];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}

