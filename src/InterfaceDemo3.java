/**
 * Created by sonal on 13/9/17.
 */
interface sayble1{
    void say();//abstract method

    //object class methods
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
public class InterfaceDemo3 implements sayble1 {

    @Override
    public void say() {

    }
}
