package Array;
import java.util.Arrays;
public class movezerotofrontwithoutsort {
	public static void main(String[] args) {

        int[] a = {0, 1, 0, 2, 0, 3, 0, 4};

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            if (a[i] == 0) {
                i++;
            } 
            else if (a[j] != 0) {
                j--;
            } 
            else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
