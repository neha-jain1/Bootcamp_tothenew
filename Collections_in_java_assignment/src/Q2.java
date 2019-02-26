// Q2 Write a method that takes a string and returns the number of unique characters in the string.
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.next();
        List<String> arr=Arrays.asList(s.split(""));
        Set<String> set_formed=new HashSet<String>(arr);
        int len=set_formed.size();

        System.out.println("Total unique characters present are "+ len);
    }
}
