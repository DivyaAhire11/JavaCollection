/*
  * SPECIAL METHODS OF LIST 
  List have index  
  1.void add()  : index wise addition : OVVERLOADED METHOD
  2.Object remove() : OVERLOADED METHOD
  3.get()
  4.set()
  5.indexOf()
  6.lastIndexOf()

//boolean remove() : datawise
//Object remove() : index wise by default

*/

import java.util.ArrayList;

class MyArrayList2 {
  public static void main(String args[]) {
    ArrayList a = new ArrayList(); // Collection create means group create karto : unlimited Size
    a.add(111); // 111 converts ---> new Integer(111) : means objects add
    a.add(222);
    a.add(333);
    a.add(444);
    a.add(555);
    a.add("hello");

    System.out.println(a); // [111, 222, 333, 444, 555, hello]

    System.out.println("---------------------------------------------------");

    a.add(2, "Divya"); // index wise data add
    // a.add(20,"Divya"); //IndexOutOfBoundsException

    System.out.println(a); // [111, 222, Divya, 333, 444, 555, hello]

    System.out.println("---------------------------------------------------");

    a.remove(4); // 444 remove
    // a.remove(222); // by default indexwise remove : Exception
    boolean ob = a.remove(new Integer(222)); // Object Wise Remove
    System.out.println(ob);

    a.remove("Divya");
    System.out.println(a); // [111, 333, 555, hello]

    System.out.println("---------------------------------------------------");

    Object ob1 = a.remove(2); // Index Wise remove : 2 is index //Deleted element will be return
    System.out.println(ob1); // 555
    System.out.println(a); // [111, 333, hello]

    System.out.println("---------------------------------------------------");

    System.out.println("Data at 2nd Index : " + a.get(2)); // hello

    System.out.println(a); // [111, 333, hello]
    a.set(2, "Byy");
    System.out.println(a); // [111, 333, Byy]

    System.out.println(a.get(2)); // Byy

  }
}
