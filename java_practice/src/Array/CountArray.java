package Array;
public class CountArray {
	public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("Count = " + count);
    }
}
