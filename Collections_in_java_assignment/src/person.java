
import java.util.ArrayList;
import java.util.Iterator;
public class person {
    String name;
    int age;
    person (String name, int age){
        this.name=name;
        this.age=age;
    }
}
class employee extends person{
    int emp_id;
    employee(String name,int age, int emp_id){
        super (name,age);
        this.emp_id=emp_id;
    }
}
class main{
    public static void main(String[] args) {
        employee e1=new employee("Arun", 20, 2234);
        employee e2=new employee("Arnav", 20, 2345);
        ArrayList<employee> a=new ArrayList<employee>();
        a.add(e1);
        a.add(e2);
        Iterator i= a.iterator();
        while(i.hasNext()){
            employee t=(employee)i.next();
            System.out.println(t.emp_id+" "+t.name+" "+t.age);

        }

    }
}