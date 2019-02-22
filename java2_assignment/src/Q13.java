import sun.nio.ch.sctp.SctpNet;
import java.util.*;
//Create a custom exception that do not have any stack trace.
public class Q13 {
    int age;
    void check(int age) throws customException{
        this.age=age;
        if(age<0){
            throw new customException();
        }
        else{
            System.out.println("Your input encountered successfully");
        }
    }
    public static void main(String[] args) {
        Q13 q13=new Q13();
        System.out.println("Enter Age");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        try{
            q13.check(a);

        }
        catch (customException e) {
            System.out.println("Exception encountered");
        }

    }
}
class customException extends Exception{
    customException(){
        System.out.println("Custom Exception Encountered");
    }
}