package collections;
import java.util.ArrayList;

public class Sample2 {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();

        l1.add(10);
        l1.add(0);
        l1.add('A');
        l1.add("hello");

        System.out.println(l1);

        l1.remove(3);
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1);
    }
}