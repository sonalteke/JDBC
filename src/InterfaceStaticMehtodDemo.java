import static java.util.Objects.isNull;

/**
 * Created by sonal on 19/9/17.
 */
interface interface3{
    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("print my data :" + str);
        }
    }
    static boolean isnull(String str){
        System.out.println("interface null check");
        return str==null?true:" ".equals(str)?true:false;
    }
}
public class InterfaceStaticMehtodDemo implements interface3 {

    public boolean isnullclassmethod(String str) {
        System.out.println("implementation null check");
        return str == null ? true : false;
    }

    public static void main(String[] args) {
        boolean b=interface3.isnull("hi....");
        System.out.println(b);

        InterfaceStaticMehtodDemo is=new InterfaceStaticMehtodDemo();
        is.print("hello");

        boolean b1=is.isnullclassmethod("hello");
        System.out.println(b1);

    }
}
