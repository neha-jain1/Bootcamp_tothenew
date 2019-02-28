// Q2 Create a functional interface whose method takes 2 integers and return one integer.

public class Q2 {
}

interface perform{
    int calculate(int a, int b);
}
class lambda{
    static int multiply(int a,int b){
        return (a*b);
    }
    public static void main(String[] args) {
        perform var1= lambda:: multiply;
        System.out.println(var1.calculate(3,4));
    }
}