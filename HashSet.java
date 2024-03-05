import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Virat");
        hashSet.add("MSD");
        hashSet.add("MSD");
        hashSet.add("Rohit");
        hashSet.add("Kl Rahul");

        System.out.println("HashSet: " + hashSet);

        // Checking if an element is present
        boolean containsVirat = hashSet.contains("Virat");
        System.out.println("Contains 'Virat': " + containsVirat);

        boolean containsHardik = hashSet.contains("Hardik");
        System.out.println("Contains 'Hardik': " + containsHardik);

        // Removing an element
        hashSet.remove("Kl Rahul");
        System.out.println("HashSet after removing 'Kl Rahul': " + hashSet);

        // Checking size
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}