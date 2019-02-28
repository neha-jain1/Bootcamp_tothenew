// Q10 Sum all the numbers greater than 5 in the integer list.

import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7).stream()
                .filter(e->e>5)
                .mapToInt(e->e)
                .sum());
    }
}
