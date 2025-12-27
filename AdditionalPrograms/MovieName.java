package AdditionalPrograms;

import java.util.*;
import java.io.*;
/*
   accept n movie names from user and sort the listin descending order.
 */
public class MovieName {
    public static void main(String[] args)throws IOException {
      int n;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("How many Movie names you want :");
      n = Integer.parseInt(br.readLine());
      ArrayList<String> a = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        System.out.print("Enter Movie Name : ");
        a.add(br.readLine());
      }
      System.out.println("The movie names in list using iterator...");
      Iterator<String> it = a.iterator();
      while(it.hasNext())
         System.out.println("\t"+it.next());

      ListIterator<String> lit = a.listIterator();
      while(lit.hasNext())
          lit.next();

     System.out.println("The movie names of arraylist in reverse order...");
     Collections.sort(a,Collections.reverseOrder());

     System.out.println("After Sorting :");
     for(String counter : a)
        System.out.println(counter);
    }
}
