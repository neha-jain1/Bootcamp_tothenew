//Using (instance) Method reference create and apply add and subtract method
// and using (Static) Method reference create and apply multiplication method
// for the functional interface created.
public class Q3 {
}
@FunctionalInterface
interface create{
     int multiply(int a , int b);
}
class lambdas{
    static int add(int c,int d){
        return (c+d);
    }
    static int sub(int a,int b){
        return (a-b);
    }
    public static void main(String[] args) {
        create var1= (a,b)-> (a*b);
        System.out.println(var1.multiply(2,3));

        create var2=lambdas:: add;
        System.out.println(var2.multiply(2,3));

        create var3=lambdas:: sub;
        System.out.println(var3.multiply(2,3));
    }
}
