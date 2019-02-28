// Q7 Override the default method of the interface.


interface  myinterface1{
    default void  display(){
        System.out.println("Default Display method has been called");
    }
}
public class Q7 implements myinterface1  {
        public void display(){
        System.out.println("Display method using method overriding ");
    }
    public static void main(String[] args) {
        Q7 obj =new Q7();
        obj.display();

    }
}