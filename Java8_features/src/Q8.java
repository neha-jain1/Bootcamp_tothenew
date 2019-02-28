// Q8 Implement multiple inheritance with default method inside  interface.
interface main_interface{
    default void display(){
        System.out.println("Calling display of main interface");
    }
}
interface  interface1 extends main_interface {
    default void display(){
        System.out.println("Calling display method of interface1");
    }
}
interface interface2 extends main_interface{
    default void display(){
        System.out.println("Calling display method of interface2");
    }
}
public class Q8 implements interface1,interface2{
    public void display(){
        System.out.println("Calling overriden display method");
    }
    public static void main(String[] args) {
        Q8 obj= new Q8();
        obj.display();
//        interface1.super.display();
    }
}