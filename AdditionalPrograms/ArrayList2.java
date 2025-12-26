package AdditionalPrograms;

import java.util.*; //ArrayList ,LinkedList ,HashSet ,HashMap

/*
  ArrayList 
  LinkedList
  HashSet
  HashMap
*/

public class ArrayList2 {
    public static void main(String[] args) {
        // maintain insertion order
        // allowed duplicated
        // index-based access(get,set)
        // fast retrive(O(1))
        // slow insertion in middle
        // not synchronized
        // uses dynamic array(non contiguous logically , contiguous internally)
        List<String> aa = new ArrayList<>();
        aa.add("Zubir");
        aa.add("Mahesh");
        aa.add("Ayush");
        aa.add("Zubir"); // duplicates
        System.out.println("ArrayList Elements : " + aa); // [Zubir, Mahesh, Ayush, Zubir]

        // maintain insertion order
        // allowed dupicates
        // no indexbased fast access
        // fast insertion and deletion(no sifting)
        // slow search (O(n))
        // store element as a node(data+prev+next)
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Zubir");
        ll.add("Mahesh");
        ll.add("Ayush");
        ll.add("Mahesh"); // duplicates
        System.out.println("LinkedList Elements : " + ll); // [Zubir, Mahesh, Ayush, Mahesh]

        // Stores unique elements
        // Does not maintain insertion order
        // Does not allow duplicates
        // Allow only one null value
        // FastOeration(add,remove,search(O(1)))
        // no index-based access
        // depends upon hashCode() and equals
        HashSet<String> hh = new HashSet<>();
        hh.add("Zubir");
        hh.add("Mahesh");
        hh.add("Ayush");
        hh.add("Ayush"); // duplicates
        System.out.println("HashSet Elements : " + hh); // [Zubir, Mahesh, Ayush]

        // Does not maintain insertion order
        // keys must be unique
        // Values can be duplicates
        // one null key allowed
        // multiple null values allowed
        // fast retrives usiing keys(O(1))
        // not synchronized
        HashMap<String, Integer> mm = new HashMap<>();
        mm.put("Arnav", 14);
        mm.put("Mahesh", 31);
        mm.put("Zubir", 8);
        mm.put("Ayush", 12);
        mm.put("Zubir", 8); // duplicates
        System.out.println("HashMap Elements : " + mm); // {Mahesh=31, Zubir=8, Arnav=14, Ayush=12}

    }
}
