package AdditionalPrograms;

/*
   Accept n employee from user,store them into linkedlist class
   display them by using litIterator and Iterator interface
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> emp = new LinkedList<>();

        System.out.print("How many Employee you want to Entre : ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " Employee :");
        for (int i = 0; i < n; i++) {
            emp.add(sc.next());
        }
        System.out.println("-------------------EMPLOYEE ITERATES USING ITERATOR-------------------");
        Iterator<String> it = emp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------EMPLOYEE ITERATES USING LISTITERATOR-------------------");

        ListIterator<String> li = emp.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
       
        System.out.println("-------------------REVERSE ORDER ITERATES USING LISTITERATOR-------------------");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        sc.close();
    }
}
