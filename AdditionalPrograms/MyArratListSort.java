package AdditionalPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/* 
    read n string into Arraylist collection.
    sort the elements of collection in descending order(use comparator)
 */
public class MyArratListSort {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("Ram", 3000));
        list.add(new Emp("Jai", 6000));
        list.add(new Emp("Krish", 2000));
        list.add(new Emp("Tine", 2400));

        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries :");
        for (Emp e : list) {
            System.out.println(e);
        }

    }
}

class MySalaryComp implements Comparator<Emp> {
    public int compare(Emp e1, Emp e2) {
        if (e1.getSalary() < e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Emp {
    private String name;
    private int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Name : " + name + "----- Salary : " + salary;
    }

}
