package Map;

import java.util.LinkedHashMap;

public class LinkedMap2<K,V> extends LinkedHashMap<K,V> {

  private int capacity;

  LinkedMap2(int cap) {
    super(cap,0.3f,true);
    this.capacity = cap;
  }


  public static void main(String[] args) {
    LinkedMap2<String, Integer> ll = new LinkedMap2<>(3);
     ll.put("Bob",10);
     ll.put("Alice",20);
     ll.put("Jiya",50);
     ll.put("priya",19);
    
     System.out.println(ll);  //{Bob=10, Alice=20, Jiya=50, priya=19}
 
     int val = ll.get("Jiya");
     System.out.println(val);  //50
    
  }
}
