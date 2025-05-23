package Polymorphism.Binding;

public class EarlyOrStatic {

    public static class Parent
    {
        static void print()
        {
            System.out.println("I am parent method");
        }
    }
    public static class Child extends Parent
    {
        static void print()
        {
            System.out.println("I am child method");
        }
    }


    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.print();
        c.print();
    }
}


