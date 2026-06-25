package collections;

import java.util.Set;
import java.util.LinkedHashSet;

public class Removeduplicatecharfromstring {
    public static void main(String[] args) {
        String s = "aababccdee";
        Set<Character> set = new LinkedHashSet<>();

        char[] c = s.toCharArray();
        for (char x : c) {
            set.add(x);
        }

        System.out.println(set);
    }
}