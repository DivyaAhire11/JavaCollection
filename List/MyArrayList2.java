
/*
  * SPECIAL METHODS OF LIST 
  List have index  
  1.void add()  : index wise addition : OVVERLOADED METHOD
  2.Object remove() : OVERLOADED METHOD
  3.get()
  4.set()
  5.indexOf()
  6.lastIndexOf()

// boolean remove() : datawise
// Object remove() : index wise by default

*/

import java.util.ArrayList;

class MyArrayList2 {
  public static void main(String args[]) {
    ArrayList a = new ArrayList(); // Collection create means group create karto : unlimited Size
     System.out.println("--------------AAD DATA IN ARRAYLIST--------------------");

    a.add(111); // 111 converts ---> new Integer(111) : means objects add
    a.add(222);
    a.add(333);
    a.add(444);
    a.add(555);
    a.add("hello");

    System.out.println(a); // [111, 222, 333, 444, 555, hello]

    System.out.println("--------------------ADD DATA INDEX WISE-------------------------");

    a.add(2, "Divya"); // index wise data add
    // a.add(20,"Divya"); //IndexOutOfBoundsException

    System.out.println(a); // [111, 222, Divya, 333, 444, 555, hello]

    System.out.println("-------------------REMOVE DATA OBJECT WISE---------------------------");

    a.remove(4); // 444 remove
    // a.remove(222); // by default indexwise remove : Exception
   
    boolean ob = a.remove(new Integer(222)); // Object Wise Remove
    System.out.println(ob);

    a.remove("Divya");
    System.out.println(a); // [111, 333, 555, hello]

    System.out.println("----------------REMOVE DATA INDEX WISE---------------------------");

    Object ob1 = a.remove(2); // Index Wise remove : 2 is index //Deleted element will be return
    System.out.println(ob1); // 555
    System.out.println(a); // [111, 333, hello]

    System.out.println("-------------------GET,SET DATA ACCORDING TO INDEX ----------------------------");


    System.out.println("Data at 2nd Index : " + a.get(2)); // hello

    System.out.println("Before Set data At index 2 : "+a); // [111, 333, hello]
    a.set(2, "Byy");
    System.out.println("After Set data At index 2 : "+a); // [111, 333, Byy]
   
    a.add(3,"Divya");
    a.add(55);
    a.add("Good");
    a.add("Day");

    System.out.println("Getting index at 5rd index  : "+a.get(5)); // Good

     System.out.println("-----------------INDEX OF & LAST INDEX OF----------------------------------");
   
     a.set(3,9999);
     a.add("AAA");
     a.add(9999);
     a.add("BBB");

     System.out.println(a);
     System.out.println("First Occurence of 9999 :"+a.indexOf(9999));
     System.out.println("First Occurence of 9999 :"+a.lastIndexOf(9999));

  }
}
