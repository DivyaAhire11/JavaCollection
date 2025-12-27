package AdditionalPrograms;

import java.util.*;

/*
    read n string into Arraylist Collection.
    Display the elemnts of collection in reverse order.
*/
public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of arraylist :");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " Number of Elements : ");
        for (int i = 0; i < n; i++) {
            a.add(sc.next());
        }

        System.out.println("The Content of the ArrayList is : ");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("-----------------REVERSE ORDER-----------------------");
        System.out.println("After Sorting :");
        Collections.sort(a, Collections.reverseOrder());

        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}
