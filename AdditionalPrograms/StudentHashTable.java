package AdditionalPrograms;

import java.util.*;
import java.io.*;

/**
 * Enumeration is an interface used to traverse(iterate) elements of legacy
 * collection classes.
 * It mainly used with vector , HashTable
 * only 2 methods
 * boolean hasMoreElements();
 * Objects nextElement();
 */
/*
 * HashTable contains student name & percentage
 * display detail of hashtable
 * search for the specific student and display percentage
 */
public class StudentHashTable {
    public static void main(String[] args) {
        Hashtable<String, Float> ht = new Hashtable<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter How Number of Student :");
            int n = Integer.parseInt(br.readLine());
            String name, searchNm = null;
            Float per;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Name :");
                name = br.readLine();
                System.out.print("Enter Percentage : ");
                per = Float.parseFloat(br.readLine());
                ht.put(name, per);
            }
            System.out.println("Students Names Are as Followed: ");
            Enumeration<String> key = ht.keys();
            while (key.hasMoreElements()) {
                System.out.println(key.nextElement());
            }

            System.out.println("Students Percentage are as Followed : ");
            Enumeration<Float> val = ht.elements();
            while (val.hasMoreElements()) {
                System.out.println(val.nextElement() + "%");
            }
            System.out.print("Enter the Name to be Searched? : ");
            try {
                searchNm = br.readLine();
            } catch (Exception e) {
            }

            if (ht.containsKey(searchNm))
                System.out.println("Record Found and Pecentage is :" + ht.get(searchNm));
            else
                System.out.println("Record Not Found!!!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
