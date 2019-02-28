//Q4 Create an Employee Class with instance variable
// (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference

public class Q4 {
}

interface emp{
    Employee member(String name , Integer age, String city);
}
class Employee{
    String name;
    Integer age;
    String city;
    Employee(String name , Integer age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString(){
        return ("[ Name = " + this.name+ "  Age=  "+ this.age+" City= "+ this.city+" ]");
    }
}

class Main4{
    public static void main(String[] args) {
        emp obj=Employee::new;
        Employee e1= obj.member("Arun",20, "Meerut");
        Employee e2= obj.member("Arnav",21, "Delhi");
        Employee e3= obj.member("Daksh",20, "Mumbai");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }
}