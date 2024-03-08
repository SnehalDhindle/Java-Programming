import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetExample {
    public static void main(String[] args) {
        // Creating a SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();

        // Adding elements
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Orange");

        // Displaying the SortedSet
        System.out.println("SortedSet: " + sortedSet);

        // Checking the first and last elements
        String firstElement = sortedSet.first();
        String lastElement = sortedSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Headset, subset, and tailset
        SortedSet<String> headSet = sortedSet.headSet("Orange");
        SortedSet<String> subSet = sortedSet.subSet("Apple", "Orange");
        SortedSet<String> tailSet = sortedSet.tailSet("Banana");

        System.out.println("HeadSet: " + headSet);
        System.out.println("SubSet: " + subSet);
        System.out.println("TailSet: " + tailSet);
    }
}