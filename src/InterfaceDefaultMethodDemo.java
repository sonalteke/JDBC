/**
 * Created by sonal on 19/9/17.
 */

interface interface1{
    void method1(String str1);//need to implement
    default void method2(String str2){//not need to implement because default method
        System.out.println("hello "+str2);
    }
}

public class InterfaceDefaultMethodDemo implements interface1 {
    public static void main(String[] args) {
        InterfaceDefaultMethodDemo i = new InterfaceDefaultMethodDemo();
        i.method1("method1");
        i.method2("method2");
    }

        @Override
        public void method1 (String str1){
            System.out.println("hello "+str1);
        }
    }
