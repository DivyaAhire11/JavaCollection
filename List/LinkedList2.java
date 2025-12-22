
import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll); // [1, 2, 3, 4, 5]

        Object a = ll.get(3); // return object : 4
        System.out.println(a);

        ll.addLast(99);
        System.out.println(ll); // [1, 2, 3, 4, 5, 99]

        ll.addFirst(111);
        System.out.println(ll); // [111, 1, 2, 3, 4, 5, 99]

        System.out.println("First Element : " + ll.getFirst()); // return object : 111
        System.out.println("Last Element : " + ll.getLast()); // 99

        System.out.println(ll);// [111, 1, 2, 3, 4, 5, 99]
        Object d = ll.remove(0); // index : 0 = 111
        Object b = ll.remove(4); // index : 4 = 5
        boolean c = ll.remove(Integer.valueOf(4)); // return boolean : true

        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ll); // [1, 2, 3, 99]

        Object aa = ll.removeFirst();
        System.out.println(aa); // 1

        Object bb = ll.removeLast();
        System.out.println(bb); // 99

        System.out.println(ll); // [2, 3]
        ll.add(2, 44); // [2,3,44]
        ll.add(1, "divya"); // [2, divya, 3, 44]
        ll.add(4, "hii"); // [2, divya, 3, 44, hii]
        ll.add(3, 2.5f); // [2, divya, 3, 2.5, 44, hii]
        ll.add(5, 44); // [2 , divya, 3, 2.5, 44, 44, hii]
        System.out.println(ll); // [2, divya, 3, 2.5, 44, 44, hii]

        LinkedList l2 = new LinkedList();
        l2.add(22);
        l2.add(33);
        l2.add(54);

        LinkedList animals = new LinkedList(Arrays.asList("cat", "Dog", "Rabbit", "Elephant"));
        LinkedList animalsToRemove = new LinkedList(Arrays.asList("cat", "Dog", "Lion"));

        animals.removeAll(animalsToRemove);

        System.out.println(animals); // [Rabbit, Elephant]
        System.out.println(animalsToRemove); // [cat, Dog,Lion]

    }
}
