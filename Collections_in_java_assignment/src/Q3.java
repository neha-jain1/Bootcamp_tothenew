// Q3 Write a method that takes a string and print the number of
// occurrence of each character characters in the string.
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        char[] arr=s.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else{
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
        System.out.println(m.entrySet());
    }
}
