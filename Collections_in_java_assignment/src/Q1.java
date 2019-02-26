// Q1 Write Java code to define List . Insert 5 floating point numbers in List
// , and using an iterator, find the sum of the numbers in List.
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        List li= new ArrayList();
        Scanner sc=new Scanner(System.in);
        float sum=0;
        System.out.println("Enter some float values");
        for (int i=0;i<5;i++){
            float t=sc.nextFloat();
            li.add(t);
        }
        Iterator i=li.iterator();
        while(i.hasNext()){
            sum+=(float)i.next();
        }
        System.out.println("Sum of Entered float values is "+ sum);
    }
}
