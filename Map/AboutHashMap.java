package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
/**
 * HashMap
 * No order guaranteed
 * Fast performance
 * Allows one null key and multiple null values
 */
public class AboutHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        // ----------------Adding Elements(put)-----------------------
        hm.put(111, "Ritu");
        hm.put(2, "Akshit");
        hm.put(73, "Neha");
        hm.put(53, "Shubham");

        System.out.println(hm); // {2=Akshit, 53=Shubham, 73=Neha, 111=Ritu}

        // --------------Accessing Elements (get)------------------------
        String nm = hm.get(73);
        System.out.println("Get Value of key 73 : " + nm); // Neha

        System.out.println("Get Value of key 5 : " + hm.get(5)); // null

        // ----------------Checking Keys and Values----------------------------
        System.out.println("Check if key Present in map? :" + hm.containsKey(45)); // false
        System.out.println(hm.containsKey(53)); // true

        System.out.println("Check if Value Present in map? :" + hm.containsValue("Shubham")); // true
        System.out.println(hm.containsValue("Ritudi")); // false

        System.out.println("Is Empty? : " + hm.isEmpty()); // false
        System.out.println("Size of the map : " + hm.size()); // 4

        hm.put(null, null);
        hm.put(3, null);
        hm.put(7, "7");

        System.out.println(hm); // {null=null, 2=Akshit, 3=null, 53=Shubham, 7=7, 73=Neha, 111=Ritu}

        hm.remove(null); // key
        hm.remove(7, "7");

        System.out.println(hm); // {2=Akshit, 3=null, 53=Shubham, 73=Neha, 111=Ritu}

        // -----------------keySet()---------------------
        // Set<Integer> keys = hm.keySet();
        // for(int i : keys){
        // System.out.println(hm.get(i));
        // }

        Set<Integer> keys = hm.keySet();
        System.out.println(keys); // [2, 3, 53, 73, 111]

        for (int x : hm.keySet()) {
            System.out.println(hm.get(x));
        }

        hm.replace(3, "Sayali");
        System.out.println(hm); // {2=Akshit, 3=Sayali, 53=Shubham, 73=Neha, 111=Ritu}

        // Set of collection of entries

        Set<Map.Entry<Integer, String>> entry = hm.entrySet();
        System.out.println(entry);// [2=Akshit, 3=Sayali, 53=Shubham, 73=Neha, 111=Ritu]

        for(Map.Entry<Integer,String> i : entry){
            System.out.println(i.getKey() +" : "+i.getValue());
            i.setValue(i.getValue().toUpperCase());
           
        }

          System.out.println(entry);  //[2=AKSHIT, 3=SAYALI, 53=SHUBHAM, 73=NEHA, 111=RITU]
          System.out.println(hm);   //{2=AKSHIT, 3=SAYALI, 53=SHUBHAM, 73=NEHA, 111=RITU}


          for(String value : hm.values()){
            System.out.println(value);
          }
    }
}
