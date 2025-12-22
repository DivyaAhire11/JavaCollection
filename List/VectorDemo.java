import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        /*
         * Vector v = new Vector<>();
         * System.out.println("Default Capacity of Vector : " + v.capacity()); // 10
         * 
         * Vector v2 = new Vector<>(5);
         * System.out.println("Capacity of Vector2 : " + v2.capacity()); // 5
         * v2.add(1);
         * v2.add(1);
         * v2.add(1);
         * v2.add(1);
         * v2.add(1);
         * v2.add(1);
         * System.out.println("Capacity of Vector2 After Adding Objects: " +
         * v2.capacity()); // 10
         * System.out.println("Size Of the Vector : " + v2.size()); // 6
         * 
         * Vector v3 = new Vector(5, 3);// 5 : initial capacity , 3 : capacityIncrement
         * System.out.println("Capacity of Vector3 : " + v3.capacity()); // 5
         * v3.add("hello");
         * v3.add("hello");
         * v3.add("hello");
         * v3.add("hello");
         * v3.add("hello");
         * v3.add("hello");
         * System.out.println("Capacity of Vector3 After Adding Objects: " +
         * v3.capacity()); // 8(incr by 3)
         * System.out.println("Size Of the Vector : " + v3.size()); // 6
         * v3.add("Good Day!!!");
         * v3.add("Good Day!!!");
         * v3.add("Good Day!!!");
         * v3.add("Good Day!!!");
         * System.out.println("Capacity of Vector3 After Adding Objects: " +
         * v3.capacity()); // 11(incr by 3)
         * System.out.println("Size Of the Vector : " + v3.size()); // 10
         */

        Vector v = new Vector(Arrays.asList(2,3,4));
        LinkedList l = new LinkedList<>();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(11);
        Vector v2 = new Vector<>(l);
         System.out.println("Vector using asList method : "+v);  //[2, 3, 4]
         System.out.println("Vector add Link list collection  : "+v2);  // [11, 22, 33, 11]
    }
}
