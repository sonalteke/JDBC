/**
 * Created by sonal on 13/9/17.
 */
interface eatable{
    void eat();
}
public class AnonymousDemo2 {
    public static void main(String[] args) {
        eatable e=new eatable() {//object of anonymous class created referred by e reference variable of eatable type
            @Override
            public void eat() {
                System.out.println("in eat method...");
            }
        };
        e.eat();
    }
}
