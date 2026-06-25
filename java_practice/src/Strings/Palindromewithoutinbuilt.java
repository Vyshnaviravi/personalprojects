package Strings;
public class Palindromewithoutinbuilt {
  public static void main(String[] args) {
        String S = "level";
        char[] x = S.toCharArray();
        int i = 0;
        int j = x.length - 1;
        while (i < j) {
            if (x[i] != x[j]) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}