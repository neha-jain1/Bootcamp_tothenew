// (1) First number is greater than second number or not             Parameter (int ,int ) Return bool
@FunctionalInterface
interface  check {
    Boolean check_num(int a, int b);
}
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
@FunctionalInterface
interface  increment{
    int increment_num(int a);
}
// (3) Concatination of 2 string                                Parameter (String , String ) Return (String)
@FunctionalInterface
interface  join{
    String concat(String a,String b);
}
//(4) Convert a string to uppercase and return .                           Parameter (String) Return (String)
@FunctionalInterface
interface  convert{
    String upper(String a);
}
public class Q1 {
    public static void main(String[] args) {
        check var1=(a,b)->{if(a>b) return Boolean.TRUE; else return Boolean.FALSE;};
        System.out.println(var1.check_num(5,4));
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>");
        increment var2=a-> a+1;
        System.out.println(var2.increment_num(3));
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>");
        join var3=(a,b)-> (a+b) ;
        System.out.println(var3.concat("Hello" ,"Neha"));
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>");
        convert var4=a-> a.toUpperCase() ;
        System.out.println(var4.upper("Hello" ));
    };
}


