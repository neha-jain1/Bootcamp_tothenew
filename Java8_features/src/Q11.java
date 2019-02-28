import java.util.Arrays;
import java.util.function.*;
// Q11 Find average of the number inside integer list after doubling it.
public class Q11 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5)
                .stream().mapToInt(e->e*2)
                .average());
    }
}
