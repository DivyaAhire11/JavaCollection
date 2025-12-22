import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        List<String> l2 = new ArrayList<String>();

        l1.add(10);
        l1.add(20);

        l2.add("BTech");
        l2.add("Smart");
        l2.add("Class");
        l1.add(l2);

        System.out.println("Elements of List 1 : " + l1); // [10, 20, [BTech, Smart, Class]]
        System.out.println(l2); // [BTech, Smart, Class]

        System.out.println("Search for BTech : " + l1.contains("BTech")); // false
        // Java does not look inside nested collections automatically
        // It compares "BTech" with:
        // 10 → not equal
        // 20 → not equal
        // [BTech, Smart, Class] → a List, not a String

        System.out.println("Search for List 2 in List 1 : " + l1.contains(l2)); // true
        System.out.println(l2.contains("BTech")); // true

        System.out.println("Search for List 2 in List 1 : " + l1.containsAll(l2)); // false
        // Are all elements of l2 direct elements of l1?

        // l1.addAll(l2);
        // System.out.println(l1);//[10, 20, [BTech, Smart, Class], BTech, Smart, Class]
        // System.out.println(l2);//[BTech, Smart, Class]

        System.out.println(l2);// [BTech, Smart, Class]
        System.out.println(l1); // [10, 20, [BTech, Smart, Class]]
        System.out.println("Check whether list1 and list2 are equal : " + l1.equals(l2)); // false
        System.out.println("Check is list1 empty :" + l1.isEmpty()); // false
        System.out.println("Size of list1 : " + l1.size()); // 3
        System.out.println("Hashcode of List1 :" + l1.hashCode()); // -802946693

        l1.remove(0);
        System.out.println(l1); //[20, [BTech, Smart, Class]]

        l1.retainAll(l2);
        System.out.println(l1); //[]

        l1.removeAll(l2);
        System.out.println(l1); //[]

        l2.clear();
        System.out.println(l2); //[]
       
    }
}
