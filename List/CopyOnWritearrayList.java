
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.CopyOnWriteArrayList;
/**
 * Yat list chi 1 copy tayar hote and tye copy madye modification hotat ,at last list cha reference update hoil
 * yat dusre thread he unaffected rahtil
 * 
 * multiple threads simultaneously read
 * when anyone want to write they create copy of list and then modify and then at last update original list
 *  used when read more
 */
class CopyOnWritearrayListDemo {
    public static void main(String[] args) {
       // List<String> list= new ArrayList<>();//Exception : ConcurrentModificationException
       List<String> list = new CopyOnWriteArrayList<>();
       list.add("Milk");
        list.add("Eggs");
        list.add("Bread");

        System.out.println(list);

        for(String i : list){
            System.out.println(i);
            if(i.equals("Bread")){
                list.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Upadated List : "+list);
    }
}
