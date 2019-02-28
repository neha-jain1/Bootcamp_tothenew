// Implement following functional interfaces from java.util.function using lambdas:


import java.util.function.*;

public class  Q5{
    public static void main(String[] args) {
        //(1) Consumer
        Consumer var1= (a)-> {System.out.println("Operation via Consumer interface " + (int)a*2);};
        var1.accept(3);

        //(2) Supplier
        Supplier var2= ()-> Math.PI;
        System.out.println(var2.get());

        ////(3) Predicate

        Predicate<Integer> var3= (e)->{ return (e>10);};
        System.out.println(var3.test(5));

        // (4) Function
        Function<Integer,Integer> var4= ( a)-> { return (a*4); };
        System.out.println(var4.apply(4));


    }
}


//

//
