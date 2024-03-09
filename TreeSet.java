import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");

        // Displaying the TreeSet (elements are sorted)
        System.out.println("TreeSet: " + treeSet);

        // Checking the first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Retrieving elements based on their relationships
        System.out.println("Ceiling of 'Mango': " + treeSet.ceiling("Mango"));
        System.out.println("Floor of 'Mango': " + treeSet.floor("Mango"));
        System.out.println("Higher of 'Mango': " + treeSet.higher("Mango"));
        System.out.println("Lower of 'Mango': " + treeSet.lower("Mango"));

        // Removing elements
        treeSet.remove("Banana");
        System.out.println("TreeSet after removing 'Banana': " + treeSet);

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
