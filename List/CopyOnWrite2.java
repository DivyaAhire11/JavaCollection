
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnWrite2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
      
       list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
      
        System.out.println(list); //[Item 1, Item 2, Item 3]

        Thread readThread = new Thread(() -> {
             try {
                while(true){
                    //Iterate through the list
                    for(String item : list){
                        System.out.println("Reading Item :"+item);
                        Thread.sleep(100);  //milli sec //Small delay to simulate work
                    }
                }
             } catch (Exception e) {
                System.out.println("Exception in reader thread : "+e);
             }       
        });

        Thread writeThread = new Thread(() -> {
             try {
                Thread.sleep(500);  //Delay to allow reading to start first
                list.add("Item 4");
                System.out.println("Added Item 4 to the list");

                Thread.sleep(500);
                list.remove("Item 1");
                 System.out.println("Remove Item 1 to the list");
             } catch (Exception e) {
                 System.out.println("Exception in reader thread : "+e);
             }
        });



    }
}
