/**
 * Created by sonal on 13/9/17.
 */

interface sayble{
    void say(String msg);
}
public class InterfaceDemo2 implements sayble{
    public static void main(String[] args) {
        InterfaceDemo2 id2=new InterfaceDemo2();
        id2.say("hello...");
    }

    @Override
    public void say(String msg) {
        System.out.println("in say method...."+msg);
    }
}
