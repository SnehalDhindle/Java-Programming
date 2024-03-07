import java.util.LinkedHashSet;

class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Virat");
        linkedHashSet.add("MSD");
        linkedHashSet.add("Rohit");
        linkedHashSet.add("Hardik");

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking if an element is present
        boolean containsMSD = linkedHashSet.contains("MSD");
        System.out.println("Contains 'MSD': " + containsMSD);

        // Removing an element
        linkedHashSet.remove("Hardik");
        System.out.println("LinkedHashSet after removing 'Hardik': " + linkedHashSet);

        // Checking size
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}