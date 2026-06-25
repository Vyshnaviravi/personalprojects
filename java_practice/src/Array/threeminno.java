package Array;

public class threeminno {
    public static void main(String[] args) {

        int[] a = {2, 5, 1, 4, 3};

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int tmin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                tmin = smin;
                smin = min;
                min = a[i];
            }
            else if (a[i] < smin && a[i] != min) {
                tmin = smin;
                smin = a[i];
            }
            else if (a[i] < tmin && a[i] != smin && a[i] != min) {
                tmin = a[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Second Min: " + smin);
        System.out.println("Third Min: " + tmin);
    }
}