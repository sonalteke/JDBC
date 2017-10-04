package MethodReference;

/**
 * Created by sonal on 20/9/17.
 */

interface sayble{
    void say();
}
public class MethodReferenceDemo1 {
    public static void saynothing(){
        System.out.println("in static method");
    }

    public static void main(String[] args) {
        //referring static method
        sayble s=MethodReferenceDemo1::saynothing;
        //calling interface method
        s.say();
    }
}
