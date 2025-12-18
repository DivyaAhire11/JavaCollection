/*
 *METHODS OF COLLECTION INTERFACE
 Common methods for entire collection
  1.boolean add() : succrssful insertion : true return ow false : WITHOUT INDEX
  2.int size() 
  3.boolean remove()  : the element that was removed from the list
  4.boolean isEmpty()
  5.boolean contains(object)  : check elements present or absent
  6.void clear()

  * SPECIAL METHODS OF LIST 
  List have index  
  1.add()  : index wise addition : OVVERLOADED METHOD
  2.revove() : OVERLOADED METHOD
  3.get()
  4.set()
  5.indexOf()
  6.lastIndexOf()




List : List is a collection 
 *) LIST : AARAYLIST 
 *) Duplicate Allowed
 *) AutoBoxing
 *) null allowed in List
 *) Ordered by insertion
 *) No Limitation of Size and Any Data we can stored
 *) ArrayList madye kadhi false nhi yenar insertion la karn kontehi value store karta and unlimited size mule
 *) Automatic grow and shrink
*/


import java.util.*;

class MyArrayList {
    public static void main(String args[]){
       // ArrayList al = new ArrayList(50);  //50 is not size
        ArrayList al = new ArrayList(); 
        System.out.println(al);                  //[]
        System.out.println("Size : "+al.size());          //Size : 0
        System.out.println("Empty ? :"+al.isEmpty());      //Empty ? :true

        // Student st = new Student();
        // Employee e = new Employee();
        // Integer i = new Integer(5);
        // Float f = new Float(2.5f);
        // String name = "Hello";

        // al.add(st);
        // al.add(e);
        // al.add(i);
        // al.add(f);
        // al.add(name);
        // al.add("Hii");
        // al.add("Hii");  //duplicate value
        // al.add(new Integer(27));
        //  al.add(2.4f); //2.4f is not a object  : after jdk1.5, autoboxing, new Float(2.5f)
     //AutoBoxing : automatic convert primitive --> non primitive


       al.add(111); //new Integer(111) : Integer class cha object add kela : autoboxing
       al.add(222);
       al.add("Divya");
       al.add(null);

        System.out.println(al);                 //[111, 222, Divya, null]
        System.out.println("Size : "+al.size());        //Size : 4
        System.out.println("Empty? :"+al.isEmpty());   //Empty? :false

        System.out.println("----------------------------------------------------");
        boolean ans;
        ans = al.add(222);
        System.out.println("Successfull insertion? : "+ans);  //true
        System.out.println(al);  // toString() = [111, 222, Divya, null, 222]
   
       System.out.println("----------------------------------------------------");
       
       System.out.println(al.contains("hello")); //false
       System.out.println(al.contains(222));  //true
       System.out.println(al.contains(null));  //true
       
       System.out.println("----------------------------------------------------");
       System.out.println("Before Remove : "+al);  //Before Remove : [111, 222, Divya, null, 222]
    //    al.remove(111);
       al.remove("Divya");
       System.out.println("After revove : "+al); //After revove : [111, 222, null, 222]

       ans = al.remove("byy");
       System.out.println(ans);  //false

    //    System.out.println(al);  //[111, 222, Divya, null, 222]
    //    al.clear();
    //    System.out.println(al);  // []
   
       
    }
}
