import java.util.Scanner;
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
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to check prime or not:");
        int n=s.nextInt();
        Boolean b=PrimeDemo.isPrime(n);
        System.out.println(b);
    }
}
