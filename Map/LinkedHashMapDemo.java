package Map;

import java.util.*;
/**
 * Map is NOT a Collection
 * LinkedHashMap : Maintains insertion order
 * Slightly slower than HashMap
 * not thread-safe
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>(11,0.3f,true); //double LinkedList
        //accessOrder : true for access-order, false for insertion-order(Bydefault)
        lhm.put("Divya",10);
         lhm.put("Neha",85);
         lhm.put("Riya",8);
         lhm.put("Divya",74);
    
         System.out.println(lhm);  //{Neha=85, Riya=8, Divya=74}  accessOrder : true
        // System.out.println(lhm);  //{Divya=74, Neha=85, Riya=8} accessOrder : false
   
         lhm.get("Riya");
         lhm.get("Neha"); //Latest used : end la add : 

         //ji used nhi hot ti top la rahte : Least recently data remove

         for(Map.Entry<String ,Integer> e : lhm.entrySet()){
            System.out.println(e.getKey() +" : "+e.getValue());
         }
         //Divya : 74 , Riya : 8 , Neha : 85

         lhm.remove("Divya");
         System.out.println(lhm.get("Divya"));  //null
         System.out.println(lhm);  //{Riya=8, Neha=85}

         lhm.put("Jiya",99);
         lhm.get("Neha");
         lhm.get("Jiya");
         lhm.get("Riya");
         lhm.get("Neha");

         for(Map.Entry<String,Integer> t : lhm.entrySet()){
             System.out.println(t.getKey() +" = "+t.getValue());
         }
         //Jiya = 99 , Riya = 8 , Neha = 85
       
        Map<String ,Integer> hm = new HashMap<>();
         hm.put("Divya",10);
         hm.put("Neha",85);
         hm.put("Riya",8);
         hm.put("Divya",74);
    
         System.out.println(hm);  //{Neha=85, Divya=74, Riya=8}
   
        

        //  cashing : Least recently remove(srvat aadhichi used zaleli  )

        HashMap<String ,Integer> hh = new HashMap<>();
        LinkedHashMap<String , Integer> ll = new LinkedHashMap<>(hh);
        hh.put("Siya",10);
        hh.put("Jiya",33);
        hh.put("Priya",78);

           int a =  hh.getOrDefault("Jiya", null);
           int b = hh.getOrDefault("Sima", 0); //key ,default
           int c = hh.getOrDefault("ABCDE", 100000);

           System.out.println(a);  //33
           System.out.println(b);  //0(Not Found so default)
           System.out.println(c);  //100000 (Not Found so default)


           hh.putIfAbsent("Sima", 100);
           hh.putIfAbsent("Siya", 999);
       
           // hh.put("Priya" ,900); //Replace

           System.out.println(hh); //{Priya=78, Jiya=33, Siya=10, Sima=100}
           System.out.println(ll);  //{}

           LinkedHashMap<String , Integer> lll = new LinkedHashMap<>(hh);
           System.out.println(lll);  //{Priya=78, Jiya=33, Siya=10, Sima=100}
        }
}
