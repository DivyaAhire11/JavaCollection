package AdditionalPrograms;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("First");
        a1.add("Second");
        a1.add("Third");
        a1.add("Fourth");
        a1.add("Fifth");
        a1.add(2, "Middle");
        System.out.println(a1); // [First, Second, Middle, Third, Fourth, Fifth]

        System.out.println("Size of ArrayList after addition is : " + a1.size()); // 6
        
        a1.remove("Third");
        a1.remove(1);
       
        System.out.println("Size of ArrayList after deletion is : " + a1.size());
        System.out.println("Elements in ArrayList : " + a1); // [First, Middle, Fourth, Fifth]

    }
}
