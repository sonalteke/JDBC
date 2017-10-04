package MethodReference;

/**
 * Created by sonal on 20/9/17.
 */
//in this example
public class MethodReferenceDemo2 {
    public static void threadstatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t=new Thread(MethodReferenceDemo2::threadstatus);
        t.start();
    }
}
