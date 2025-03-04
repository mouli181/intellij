package List;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(30);
        b.add(50);
        b.add(10);
        System.out.println(b);
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println(c);
        System.out.println(c.get(2));

    }
}
