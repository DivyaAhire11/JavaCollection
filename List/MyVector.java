
/*
   Capacity : kity store hou shaktat  : 10 chi capacity
   Size : kiti store zale ahet : store only 5 zale
   
   *)Capacity gets doubled once fulled
   *) Bydefault Capacity : 10
   *) Vector methods are synchronized(i.e Slow)
   *) veector and Hashtable is a legacy class
*/
import java.util.*;

class MyVector {
    public static void main(String[] args) {
        // Collection create
        Vector v = new Vector(5); // Capacity : 5
        System.out.println(v); // []
        System.out.println("Size = " + v.size()); // 0
        System.out.println("Capacity = " + v.capacity()); // 5 : Bydefault capacity =10
        System.out.println("isEmpty? =" + v.isEmpty()); // true

        System.out.println("--------------AAD DATA IN Vector--------------------");

        v.add("hello");
        v.add(111);
        System.out.println("Size = " + v.size());   //2
        System.out.println("Capacity = " + v.capacity()); //5
        System.out.println("isEmpty? =" + v.isEmpty());  //false
      
         System.out.println("-------------AUTOMATIC CAPACITY DOUBLE---------------------");
       
        v.add(222);
        v.add(333);
        v.add(444);
        v.add(222);
        v.add(null);

        System.out.println(v);   //[hello, 111, 222, 333, 444, 222,null]
        System.out.println("Size = " + v.size());   //7
        System.out.println("Capacity = " + v.capacity()); //10
       

    }
}
