package Polymorphism.Binding;

public class LateOrDynamic {
    public static class Parent1
    {
        void print()
        {
            System.out.println("I am parent method");
        }
    }
    public static class Child1 extends Parent1
    {
        @Override
        void print()
        {
            System.out.println("I am child method");
        }
    }


    public static void main(String[] args) {

        // Creating object of inner class 1
        // with reference to constructor of super class
        Parent1 p = new Parent1();

        // Creating object of inner class 1
        // with reference to constructor of sub class
       Parent1 c = new Child1();

        p.print();
        c.print();
    }
}



