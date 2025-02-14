import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate allowed
        System.out.println(list);// Output: [Apple, Banana, Apple]
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("orange");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println(list2);


    }
}
