/**
 * Created by sonal on 13/9/17.
 */
//public class MultiThreadInterfaceDemo implements Runnable {
//    public static void main(String[] args) {
//        MultiThreadInterfaceDemo m = new MultiThreadInterfaceDemo();
//        Thread t = new Thread(m);
//        t.start();
//    }
//
//    @Override
//    public void run() {
//        System.out.println("in run method..");
//        for (int i = 0; i <= 5; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//    }
//}
public class MultiThreadInterfaceDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("runnable using lambda...");
        });
    }
}
