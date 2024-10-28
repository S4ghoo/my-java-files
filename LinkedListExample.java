import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("LinkedList Elements: " + fruits);

        // Access the first and last element
        String firstFruit = fruits.getFirst();
        String lastFruit = fruits.getLast();
        System.out.println("First: " + firstFruit + ", Last: " + lastFruit);

        // Remove the first and last elements
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("LinkedList after removals: " + fruits);
    }
}
