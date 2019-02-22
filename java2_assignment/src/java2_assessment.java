import java.util.*;
import java.lang.*;

// Q2 Questions to sort a string without using sort method

class java2_assessment{
    public void sorting_string(){
        System.out.println("Enter string to be sorted ");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char[] arr=s.toCharArray();
        int l= arr.length;
        for (int i =0; i< l ; i++) {
            for (int j = (i + 1); j < l; j++) {
                if (arr[j] < arr[i]) {
                    char t=arr[i];
                    arr[i] = arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(arr);
    }

}

