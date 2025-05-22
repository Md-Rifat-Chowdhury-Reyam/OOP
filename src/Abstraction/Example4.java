package Abstraction;

/**
 * Abstract classes can also have final methods (methods that cannot be overridden)
 */
public class Example4 {
    public static void main(String[] args) {

        Base b = new Derives();
        b.info();
        Base.print();
    }
}

abstract class Base
{
    final void info()
    {
        System.out.println("I am final method");
    }

    static  void print()
    {
        System.out.println("I am static method");
    }
}
class Derives extends Base
{
    // This class only inherits the Base class methods and
    // properties
}