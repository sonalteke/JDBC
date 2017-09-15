import java.util.function.Supplier;

/**
 * Created by sonal on 14/9/17.
 */
public class SupplierDemo {
    static void display(Supplier<Integer> arg){System.out.println(arg.get());
    }

    public static void main(String[] args) {
        display(()->10);
        display(()->100);
        display(()->(int)(Math.random()*100));//Math=final class
    }
}
