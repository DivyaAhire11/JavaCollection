package AdditionalPrograms;

import java.util.ArrayList;

public class SumOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(32);
        num.add(72);
        num.add(234);
        num.add(342);
        num.add(53);
        System.out.println(num);

        System.out.println("Contents of ArrayList are : "+ num);
        int size = num.size();
   
        int sum = 0;
        for(int i = 0;i<size;i++){
           sum +=  num.get(i);
        }
       
        System.out.println("Sum Of the elementts are : "+sum);
    }
}
