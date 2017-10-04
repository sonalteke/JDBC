package InnerClassDemo;

/**
 * Created by sonal on 13/9/17.
 */
//Anonymousinnerclass=A class that have no name,used if you have to override the method of class or interface
abstract class person{
    abstract void eat();

    void walk() {
        System.out.println("in walk...");
    }
}
public class AnonymousDemo1 {
    public static void main(String[] args) {
        person p=new person() {
            @Override
            void eat() {
                System.out.println("eating....");
            }
        };
        p.eat();
        p.walk();
    }
}
