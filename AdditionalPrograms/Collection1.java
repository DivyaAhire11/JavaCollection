package AdditionalPrograms;

import java.util.*;

/*
   read 10 Strings from console and add them in a collection 
   the String should be stored in a collection in the descending order.
   display using iterator
 */
public class Collection1 {
    public static void main(String[] args) {
        if (args.length == 10) {
            ArrayList<String> ll = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                ll.add(args[i]);
            }
            System.out.println(ll);
            System.out.println("-------------------------------------------------");

            Iterator<String> it = ll.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.println("-------------------------------------------------");

            Collections.sort(ll, Collections.reverseOrder());

            System.out.println("After Sorting Reverse Order :");
            for (String s : ll)
                System.out.println(s);

        } else {
            System.out.println("Please Provide 10 Strings");
        }
    }
}
