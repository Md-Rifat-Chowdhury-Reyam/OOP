package Polymorphism;

public class CoVariant {
    public static void main(String[] args) {

        A1 a = new A1();
        a.method();

        B1 b = new B1();
        b.method();

    }
}

class A1
{
    public Object method()
    {
        System.out.println("I am from object type method");
        return new Object(); //having co-variant return type
    }
}

class B1 extends A1
{
    public String method()
    {
        System.out.println("method from subclass");
        return "Rifat";
    }

}
