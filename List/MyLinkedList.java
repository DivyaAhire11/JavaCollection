/**
 * SPECIAL OF LINKED LIST
 * 
 * addFirst() : add element at starting
 * addLast() 
 * removeFirst()
 * removeLast()
 * getFirst()
 * getLast()
 * 
 * [
 *   Similarity : ARRAYLIST   VECTOR  LINKEDLIST
 *   1.duplicate allowed
 *   2. null allowed
 *   3.index wise data insertion allowed
 *   4.remove possible 
 *   5.Ordered by insertion
 * ]
 * 
 * addAll : multiple ele add at a time
 * removeAll : remove multiple elements at a time
 * containsAll : khup sare objects pressent ahe ka?
 */
import java.util.*;

class MyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println(ll);  //[]
        System.out.println("Size = " + ll.size()); //0
        System.out.println("isEmpty? =" + ll.isEmpty()); //true

        System.out.println("-------------ADD ELEMENT IN LINKED LIST----------------");

        ll.add(111);
        ll.add(222);
        ll.add("hello");
        ll.add("Ritu");
        ll.add(111);

        System.out.println(ll);  //[111, 222, hello, Ritu, 111]
    
       System.out.println("-------------ADD first LINKED LIST----------------");
    
       ll.addFirst("Divya"); //[Divya, 111, 222, hello, Ritu, 111]
       System.out.println(ll); 

        System.out.println("-------------ADD last LINKED LIST----------------");
    
       ll.addLast("Byy");
       System.out.println(ll); //[Divya, 111, 222, hello, Ritu, 111, Byy]
       

    }
}
