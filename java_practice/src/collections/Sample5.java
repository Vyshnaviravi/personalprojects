package collections;
public class Sample5 {

    static Object[] arr = new Object[10];
    static int index = 0;

    void add(Object obj) {
        arr[index] = obj;
        index++;
    }

    Object get(int index) {
        return arr[index];
    }

    public static void main(String[] args) {

        Sample5 l1 = new Sample5();

        l1.add(10);
        l1.add(20.56);
        l1.add('A');

        Object o1 = l1.get(1);
        System.out.println(o1);
    }
}