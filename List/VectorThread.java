
// import java.util.*;
import java.util.ArrayList;
import java.util.Vector;

public class VectorThread {
    public static void main(String[] args) {
        // For Vector
        /*
         * Vector v = new Vector<>();
         * //Thread 1
         * Thread t1 = new Thread(()->{
         * for(int i =0 ;i<1000;i++){
         * v.add(i);
         * }
         * });
         * 
         * //Thread 2
         * Thread t2 = new Thread(() ->{
         * for(int i = 0;i<1000;i++){
         * v.add(i);
         * }
         * });
         * 
         * t1.start();
         * t2.start();
         * 
         * try {
         * t1.join();
         * t2.join();
         * } catch (InterruptedException e) {
         * System.out.println(e);
         * }
         * 
         * System.out.println("Size of Vector : "+v.size()); //2000
         */

        // For ArrayList
        ArrayList list = new ArrayList();
        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Size of Array List : " + list.size()); // 1557 changes 1498 change 1475
        // Change value when each execution

    }
}
