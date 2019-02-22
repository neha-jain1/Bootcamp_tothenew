//WAP to show object cloning in java using cloneable and copy constructor both.
import java.lang.*;

public class Q5 implements  Cloneable{
    int a;
    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();}
}
class main5{
    public static void main(String[] args) throws
            CloneNotSupportedException {
        Q5 obj1=new Q5();
        obj1.a=5;

        Q5 obj2=obj1;           // Cloning object by copy constructor

        Q5 obj3= (Q5) obj2.clone();    // Cloning object by using clone() method

        System.out.println("value of obj1 is " +obj1.a );
        System.out.println(" value of obj2 is "+ obj2.a);
        System.out.println("value of onj3 is "+ obj3.a);
    }
}
