package InnerClassDemo;

/**
 * Created by sonal on 13/9/17.
 */
//memberinnerclass : A class creted within class but outside the method
public class MemberDemo {
    private int a=100;
    int b=10;
    class innerclass{
        int c=20;
        void get(){
            System.out.println("private data...a="+a);
            System.out.println("normal data...b="+b);
            System.out.println("in get method...c="+c);
        }
    }
    public static void main(String[] args) {
        MemberDemo md=new MemberDemo();//create instance of outer class
        MemberDemo.innerclass ic=md.new innerclass(); //instance of inner class created within instance of outer class
        ic.get();
    }
}
