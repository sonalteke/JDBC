package LambdaDemo;

/**
 * Created by sonal on 18/9/17.
 */
//functional interface example

public class ThreadDemo {
    public static void main(String[] args) {

       //without lambda expression
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("my runnable");
            }
        });
        t.start();

        //with lambda expression
        Runnable runnable=()-> System.out.println("my runnable");
        new Thread(runnable).start();
    }
}


