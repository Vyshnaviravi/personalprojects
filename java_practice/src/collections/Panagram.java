package collections;
import java.util.Set;
import java.util.TreeSet;
public class Panagram {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        s = s.replaceAll(" ", "").toLowerCase();
        Set<Character> set = new TreeSet<>();
        char[] c = s.toCharArray();
        for (char x : c) {
            set.add(x);
        }
        if (set.size() == 26) {
            System.out.println("Panagram");
        } else {
            System.out.println("Not a Panagram");
        }
    }
}