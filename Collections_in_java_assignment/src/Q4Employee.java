//Q4     4. Write a program to sort Employee objects based on highest salary using Comparator
// . Employee class{ Double Age; Double Salary; String Name
import java.util.Arrays;
import java.lang.*;
import java.util.Comparator;
public class Q4Employee {
    String name;
    int age;
    int salary;
    Q4Employee(String name, int age, int sal){
        this.name=name;
        this.age= age;
        this.salary= sal;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getname(){
        return this.name;
    }
    public static Comparator<Q4Employee> SalaryComparator = new Comparator<Q4Employee>() {

        @Override
        public int compare(Q4Employee e1, Q4Employee e2) {
            return e2.getSalary()- e1.getSalary()  ;
        }
    };
    public String toString(){
        return " [name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
    }
}
class main4{
    public static void main(String[] args) {
        Q4Employee[] emp=new Q4Employee[4];
        emp[0]=new Q4Employee("Arun", 24, 25000);
        emp[1]=new Q4Employee("Arnav", 26, 55000);
        emp[2]=new Q4Employee("Daksh", 25, 75000);
        emp[3]=new Q4Employee("Kanak", 23, 50000);
        Arrays.sort(emp, Q4Employee.SalaryComparator);
        System.out.println(Arrays.toString(emp));
    }
}
