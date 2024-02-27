import java.util.*;
class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5f);
        al.add("Ram");
        al.add(10);
        al.add(20.5f);

        System.out.println(al);

        System.out.println(al.size());

        System.out.println(al.contains("Ram"));
        System.out.println(al.contains("3"));

        System.out.println(al.indexOf(20.5f));

        System.out.println(al.lastIndexOf(20.5f));

        System.out.println(al.get(3));
        

    }
}
