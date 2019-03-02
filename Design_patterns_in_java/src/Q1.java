//Q1 Implement Singleton Design Pattern on a dummy class
class Dummy{
    private static Dummy obj= null;
    public  String rule;
    private  Dummy(){
        rule = "You need to follow dummy class rules whenever you wish use it";
    }

    public static Dummy getInstance(){
        if(obj == null){
            obj=new Dummy();
        }
        //Dummy obj=new Dummy();
        return obj;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dummy obj1= Dummy.getInstance();
        Dummy obj2= Dummy.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("obj1==obj2  ::"+ (obj1==obj2));

    }
}

