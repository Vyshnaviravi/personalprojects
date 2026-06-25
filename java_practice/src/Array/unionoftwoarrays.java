package Array;
import java.util.Arrays;
public class unionoftwoarrays {
	public static void main(String[] args) {

        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 3, 4, 5};

        int[] t = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, t, 0, a1.length);
        System.arraycopy(a2, 0, t, a1.length, a2.length);

        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        for (int i = 0; i < t.length - 1; i++) {
            if (t[i] != t[i + 1]) {
                System.out.print(t[i] + " ");
            }
        }

        System.out.print(t[t.length - 1]);
    }
}

