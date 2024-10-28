import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList Elements: " + numbers);

        // Access an element
        int number = numbers.get(2);
        System.out.println("Element at index 2: " + number);

        // Remove an element
        numbers.remove(1);
        System.out.println("ArrayList after removal: " + numbers);
    }
}
