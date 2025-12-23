package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;


/**
 * map.put() : O(1)
 * map.get() : O(1)
 */
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 65);
        map.put("a", 97);
        map.put("B", 66);

        // map.put(null,20); //replace
        // map.put(null,50);//{null=50, A=65, a=97, B=66}

        System.out.println(map); // {A=65, a=97, B=66}

        map.remove("A");
       // map.remove(97); // consider as a key

        map.remove("B", 97); //false
        System.out.println(map.remove("B", 66)); //true// return : true if the value was removed
        System.out.println(map);// {a=97}


        List<Integer> list = Arrays.asList(2,4,32,54,1,45,232,41);
        list.contains(45);  //O(n)

        //Internal Structure of HashMap
        // Components : Key , Value , Bucket , Hash Function
    }
}
