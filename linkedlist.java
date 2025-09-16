import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Initial LinkedList: " + list);

        // Add element at the beginning
        list.addFirst(5);
        System.out.println("After addFirst(5): " + list);

        // Add element at the end
        list.addLast(50);
        System.out.println("After addLast(50): " + list);

        // Remove first element
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // Remove last element
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // Get element at index 1
        int secondElement = list.get(1);
        System.out.println("Element at index 1: " + secondElement);

        // Update element at index 2
        list.set(2, 99);
        System.out.println("After set(2, 99): " + list);

        // Remove element by value
        list.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + list);

        // Iterate through the list
        System.out.print("Final LinkedList using loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
