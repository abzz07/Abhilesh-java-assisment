import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");

        // Display tasks
        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Remove a task
        tasks.remove("Go for a walk");

        // Display updated list
        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
