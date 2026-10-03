import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original LinkedList: " + list);

        // Access an element using get()
        System.out.println("Element at index 2: " + list.get(2));

        // Access first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove an element by value
        list.remove("Banana");

        // Remove first element
        list.removeFirst();

        // Remove last element
        list.removeLast();

        System.out.println("After removing elements: " + list);
    }
}
