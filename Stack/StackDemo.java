package Stack;

/**
 * LIFO
 * Stack extends Vector : Inheritance
 * It is synchronized
 * making it thread-safe
 */
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        /*
          Stack s = new Stack();
          s.add(11);
          s.add("Hiii");
          s.add(22);
          s.add(11);
          s.add(32);
          s.add("Hello");
          
          System.out.println(s); // [11, Hiii, 22, 11, 32, Hello]
          
          int c = s.capacity();
          System.out.println("capacity of Stack is :" + c); // 10
          
          s.push("Divya");
          s.push("Ahire");
          System.out.println(s); // [11, Hiii, 22, 11, 32, Hello, Divya, Ahire]
          
          Object a = s.pop();
          Object b = s.pop();
          Object d = s.pop();
          
          System.out.println(a); // Ahire
          System.out.println(b); // Divya
          System.out.println(d); // Hello
          System.out.println(s); // [11, Hiii, 22, 11, 32]
          
          int aa = (Integer)s.pop();
          System.out.println(aa); //32
         */

        Stack<Integer> s2 = new Stack<>(); //generics
        s2.push(22);
        s2.push(30);
        s2.push(44);
        s2.push(55);

         System.out.println(s2); //[22, 30, 44, 55]

        //s.pop() returns an Integer object
        //Java automatically unboxes it to int if needed
        int removeEle = s2.pop(); //// auto-unboxing
        System.out.println(removeEle);

        Integer removeEle2 = s2.pop();  
        System.out.println(removeEle2);


        System.out.println(s2);  //[22, 30]
        Integer peek = s2.peek();
        System.out.println("Top Element in Stack :"+peek); //30
        System.out.println(s2.isEmpty());  //false
        s2.push(27);
        s2.push(83);
        s2.push(324);
        System.out.println(s2);  //[22, 30, 27, 83, 324]
         System.out.println(s2.size());//5

         //SEARCH
         int ans = s2.search(324);
         System.out.println(ans); //1(Present)

         int ans1 = s2.search(24);
         System.out.println(ans1); //-1(Absent)

         int ans2 = s2.search(43);
         System.out.println(ans2); //-1(Absent)
         
         //AlL METHOD OF VECTOR
        //  s2.add(78);
        //  System.out.println("Adding 78  :"+s2);  //[22, 30, 27, 83, 324, 78]
        //  s2.remove(3);
        //  System.out.println("Remove Index 3 element  : "+s2);  //[22, 30, 27, 324, 78]
        //  s2.remove(Integer.valueOf(30));
        //  System.out.println("Remove 30 element : "+s2); //[22, 27, 324, 78]


    }
}
