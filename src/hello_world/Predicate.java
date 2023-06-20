package hello_world;

import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9);
        a.stream().filter(u->u%2==0).forEach(u-> System.out.println(u));
    }

}


