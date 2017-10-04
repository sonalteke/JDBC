package InnerClassDemo;

/**
 * Created by sonal on 13/9/17.
 */
//localinnerclass= class within method
public class LocalDemo {
    void show(){
        class localinnerclass{
            void msg(){
                System.out.println("in inner class msg method...");
            }
        }
        localinnerclass llc=new localinnerclass();
        llc.msg();
    }

    public static void main(String[] args) {
        LocalDemo ld=new LocalDemo();
        ld.show();
    }
}
