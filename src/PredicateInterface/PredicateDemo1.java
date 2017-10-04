package PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sonal on 13/9/17.
 */
//predicate interface

public class PredicateDemo1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        Predicate<Integer> predicate=n->true;// n is passed as parameter to test method of predicate  interface
        System.out.println("print all numbers:");
        eval(list,n->true);

        Predicate<Integer> predicate1=n->n%2==0;
        System.out.println("print even numbers:");
        eval(list,n->n%2==0);
    }
    public static void eval(List<Integer> list,Predicate<Integer> predicate){
        for(Integer n:list){
            if(predicate.test(n)){//test value always return true no matter what value n has
                System.out.println(n);
            }
        }
    }
}

