package AdditionalPrograms;

import java.util.*;

public class EmployeeRecord {
    public static void main(String[] args) {
        
        Hashtable<String, String> ht = new Hashtable<>(); // no null key or null value
        ht.put("Amar", "Manage");
        ht.put("Deep", "Supervisor");
        ht.put("Sham", "Head");
        ht.put("Deepa", "Cleaner");
        ht.put("Khushi", "Cleaner");
      
        String k;
        Enumeration<String> key = ht.keys();
      
        while (key.hasMoreElements()) {
            k = (String) key.nextElement();
            System.out.println(k + " : " + ht.get(k));
        }
        // No insertion order maintain
    }
}
