package AdditionalPrograms;

/*
  n cities name from user store them in ArrayList.
  Program should not allow dupicate city and display it in asending order
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AboutCity {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many city You want to enter :");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Cities Names : ");
        for (int i = 0; i < n; i++) {
            city.add(sc.next());
        }
        System.out.println("ArrayList of City names : " + city); // [kerla, goa, shimla, mumbai, kerla]
        // not allowed duplicated
        // In Ascending Order
        TreeSet<String> c = new TreeSet<>(city);

        System.out.println("Ascending Order of City : " + c);  //[goa, kerla, mumbai, shimla]
        sc.close();
    }
}
