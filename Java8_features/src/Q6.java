//Q6 Create and access default and static method of an interface.


interface  myinterface{
    static void add(int a,int b){
        System.out.println("Sum of the values entered is "+(a+b));
    }

    default void  display(){
        System.out.println("Default Display method has been called");
    }
}
public class Q6 implements myinterface  {
//    public void display(){
//        System.out.println("Display method using method overriding ");
//    }
    public static void main(String[] args) {
        Q6 obj =new Q6();
        obj.display();
        myinterface.add(3,4);
    }
}
