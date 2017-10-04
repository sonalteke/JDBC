package PredicateInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sonal on 21/9/17.
 */
//find out the maximum odd number in the range 3 to 11 and return square of it.

public class PredicateDemo3 {

    public static int squareofmaxodd(List<Integer> numbers){
            int max=0;
            for(int i:numbers){
                if (i%2!=0 && i>3 && i<11 && i>max){
                    max=i;
                }
            }
            return max*max;
           }

//using stream and lambda
//           public static int findsquareofmaxodd(List<Integer> numbers){
//               return numbers.stream().filter(NumberTest::isodd).filter(NumberTest::isgreaterthan3).filter(NumberTest::islessthan11).max(Comparator.naturalOrder()).map(i->i*i).get();
//           }

           public static boolean isodd(int i){
               return i%2!=0;
           }

           public static boolean isgreaterthan3(int i){
               return i>3;
           }

           public static boolean islessthan11(int i){
               return i<11;
           }

           public static void main(String[] args) {
               List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

               int i=squareofmaxodd(numbers);
               System.out.println(i);

              // int i1=findsquareofmaxodd(numbers);
              // System.out.println(i1);
    }
}
