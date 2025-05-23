package Inheritance;

// Driver class
public class Single {
    public static void main(String[] args)
    {
        B b = new B();
        b.printM();
        b.printDis();
    }
}
// Parent class
class A {
     void printDis()
     {
         System.out.println("I am parent method");
     }
}
// child class
class B extends A{

    void printM()
    {
        System.out.println("I am child method");
    }
}