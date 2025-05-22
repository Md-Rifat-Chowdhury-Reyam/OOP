package Abstraction;

/**
 * We can use the abstract keyword
 * for declaring top-level classes (Outer class)
 * as well as inner classes as abstract
 */
public class Example5 {
    public static void main(String[] args) {

            OuterC c = new OuterC();
            OuterC.InnerD id = c.new InnerD();
            id.info();
    }
}

abstract class OuterA
{
    abstract class InnerB
    {
        abstract void info();
    }
}

class OuterC extends OuterA
{
    class InnerD extends InnerB
    {
        @Override
        void info() {
            System.out.println("We can use the abstract keyword \nfor declaring top-level classes (Outer class) \nas well as inner classes as abstract");
        }
    }

}