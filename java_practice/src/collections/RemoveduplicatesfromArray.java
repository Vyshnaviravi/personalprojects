package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveduplicatesfromArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,4,5,6,4};

        System.out.println(Arrays.toString(a));

        Set<Integer> set = new LinkedHashSet<>();

        for (int x : a) {
            set.add(x);
        }

        System.out.println(set);
    }
}