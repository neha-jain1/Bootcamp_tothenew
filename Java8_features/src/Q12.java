import java.util.Arrays;

// Q12 Find the first even number in the integer list which is greater than 3.
public class Q12 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9)
                .stream()
                .filter(e->e>3)
                .filter(e-> e%2==0)
                .findFirst());
        System.out.println("--------------------");
        System.out.println(Arrays.asList(1,2,3)
                .stream()
                .filter(e->e>3)
                .filter(e-> e%2==0)
                .findFirst());
    }
}
