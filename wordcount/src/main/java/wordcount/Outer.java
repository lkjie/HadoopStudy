package wordcount;

/**
 * Created by lwj on 14-8-15.
 */
public class Outer {
    static class Inner2{

    }
    public void dosomething(){
        final int a = 10;
        class Inner{
            public void seeOuter(){
                System.out.println(a);
            }
        }
        Inner i = new Inner();
        i.seeOuter();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.dosomething();
        Outer.Inner2 oi = new Outer.Inner2();
    }
}
