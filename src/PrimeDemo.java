import java.util.stream.IntStream;

/**
 * Created by sonal on 14/9/17.
 */
public class PrimeDemo {
    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(index -> number % index == 0);
    }

    public static void main(String[] args) {
          Boolean b=PrimeDemo.isPrime(5);
        System.out.println(b);
    }
}
