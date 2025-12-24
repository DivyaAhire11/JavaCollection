package Map;

import java.util.HashMap;
import java.util.Map;


/**
 * hashcode()
 * equals()
 */
public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>(10);
        // 4 OBjects Create :each object cha hashCode different generate
        Student s1 = new Student("Ritu", 11);
        Student s2 = new Student("PQRST", 21);
        Student s3 = new Student("XYZW", 34);
        Student s4 = new Student("Ritu", 11);


        map.put(s1, "Computer Science"); // hashcode1 --> index1
        map.put(s2, "Engineer");
        map.put(s3, "BSC");
        map.put(s4, "Arts"); // hashcode2 --- index2

        System.out.println("HashMap Size : "+map.size());   //4
        System.out.println("Value of s1 : "+map.get(s1));  //Value of s1 : Computer Science
        System.out.println("value of s4 : "+map.get(s4));   //value of s4 : Arts
       // System.out.println(s1);  //toString()

        Map<String ,Integer> map2 = new HashMap<>();
        map2.put("Shubham",20);
        map2.put("Riya",40);
        map2.put("Shubham",44);

        System.out.println(map2); //{Riya=40, Shubham=44}
    }
}

class Student {
    private String name;
    private int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String toString(){
       return "Hello Its Me";
    }
}
