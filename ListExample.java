import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        // Using List with ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        System.out.println("ArrayList: " + arrayList);

        // Using List with LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Item A");
        linkedList.add("Item B");
        linkedList.add("Item C");
        System.out.println("LinkedList: " + linkedList);
    }
}
