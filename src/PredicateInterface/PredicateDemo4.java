package PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sonal on 22/9/17.
 */
public class PredicateDemo4 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);


        eval(numbers,n->n%2==0);
    }


    public static void eval(List<Integer> numbers, Predicate<Integer> predicate){
        for (Integer num:numbers){
            if (predicate.test(num)){
                System.out.println(num);
            }
        }

    }
}
