package collections;
import java.util.ArrayList;

public class Sample3 {
    public static void main(String[] args) {

        ArrayList<Object> l1 = new ArrayList<>();

        l1.add(10);
        l1.add('A');
        l1.add(0);
        l1.add("hello");

        System.out.println(l1);

        l1.add(2, true); // insert at index 2
        System.out.println(l1);
    }
}