package Map;

import java.util.HashMap;

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

        System.out.println("Is Empty? : "+hm.isEmpty());  //false
        System.out.println("Size of the map : "+hm.size());  //4


        hm.put(null,null);
        hm.put(3,null);
        hm.put(7,"7");

        System.out.println(hm); //{null=null, 2=Akshit, 3=null, 53=Shubham, 7=7, 73=Neha, 111=Ritu}

    }
}
