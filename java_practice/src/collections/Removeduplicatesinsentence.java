package collections;

import java.util.Set;
import java.util.LinkedHashSet;

public class Removeduplicatesinsentence {
    public static void main(String[] args) {
        String S = "hi hi hello how how r r u u";
        System.out.println(S);

        Set<String> set = new LinkedHashSet<>();

        String[] c = S.split(" ");
        for (String x : c) {
            set.add(x);
        }

        System.out.println(set);
    }
}