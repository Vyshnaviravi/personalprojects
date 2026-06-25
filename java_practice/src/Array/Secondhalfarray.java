package Array;

public class Secondhalfarray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= 4) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}