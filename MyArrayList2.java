/*
  * SPECIAL METHODS OF LIST 
  List have index  
  1.void add()  : index wise addition : OVVERLOADED METHOD
  2.Object remove() : OVERLOADED METHOD
  3.get()
  4.set()
  5.indexOf()
  6.lastIndexOf()

     53.48

*/

import java.util.ArrayList;

class MyArrayList2 {
    public static void main(String args[]){
        ArrayList a = new ArrayList(); //Collection create means group create karto : unlimited Size
        a.add(111);  // 111 converts ---> new Integer(111) : means objects add 
        a.add(222);
        a.add("hello");

        System.out.println(a);
    }
}
