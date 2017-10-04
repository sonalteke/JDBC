package PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sonal on 19/9/17.
 */
public class PredicateDemo2 {
    public static int sumwithcondition(List<Integer> numbers, Predicate<Integer> predicate){
        return numbers.parallelStream().filter(predicate).mapToInt(i->i).sum();
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);
        int i1=PredicateDemo2.sumwithcondition(numbers,n->true);//addition of all numbers
        int i2=PredicateDemo2.sumwithcondition(numbers,n->n%2==0);//addition of even numbers
        int i3=PredicateDemo2.sumwithcondition(numbers,n->n>5);//sum of all numbers greater than 5

        System.out.println(numbers);
        System.out.println("addition of all numbers:"+i1);
        System.out.println("addition of even numbers:"+i2);
        System.out.println("addition of all numbers greater than 5:"+i3);
    }
}
