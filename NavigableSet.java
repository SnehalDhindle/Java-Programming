import java.util.NavigableSet;
import java.util.TreeSet;

class NavigableSetExample {
    public static void main(String[] args) {
        
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Adding elements
        navigableSet.add(3);
        navigableSet.add(1);
        navigableSet.add(5);
        navigableSet.add(2);
        navigableSet.add(4);

        // Displaying the NavigableSet
        System.out.println("NavigableSet: " + navigableSet);

        // Retrieving elements based on their relationships
        System.out.println("Ceiling of 2: " + navigableSet.ceiling(2));
        System.out.println("Floor of 2: " + navigableSet.floor(2));
        System.out.println("Higher of 2: " + navigableSet.higher(2));
        System.out.println("Lower of 2: " + navigableSet.lower(2));

        // Polling and removing elements
        System.out.println("Poll first element: " + navigableSet.pollFirst());
        System.out.println("NavigableSet after pollFirst: " + navigableSet);
        System.out.println("Poll last element: " + navigableSet.pollLast());
        System.out.println("NavigableSet after pollLast: " + navigableSet);
    }
}
