package AdditionalPrograms;

import java.util.*;

/*
   LinkedHashMap 
   put elements
   get a set of entries
   display entries
   Doposite 1000 into Zara account

 */
public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> lhm = new LinkedHashMap<>();
        lhm.put("Roja", 4534.96f);
        lhm.put("Meet", 321.22f);
        lhm.put("Guru", 3421f);
        lhm.put("Dia", 77.88f);
        lhm.put("Pia", 89.18f);

        // LinkedHashMap does NOT have iterator() directly
        // iterator() is available on:
        // keySet()
        // values()
        // entrySet()
        // Not on the Map itself.
        Set set = lhm.entrySet();

        // Get The Iterator
        Iterator i = set.iterator();
        while (i.hasNext()) { // Uses Map.Entry
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue()); // Access key & value separately
        }
        
        // while (i.hasNext()) { // Uses toString()
        //     System.out.println(i.next()); // Prints entry as key=value
        // }

        for (Map.Entry<String, Float> me : lhm.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        // Deposite 1000 into Meet's account
        float b = lhm.get("Meet");
        lhm.put("Meet", (b + 1000));
        System.out.println("Meet's new Balance : " + lhm.get("Meet"));
    }
}
