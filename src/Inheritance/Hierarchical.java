package Inheritance;


public class Hierarchical {
    public static void main(String[] args) {
       B2 b = new B2();
       b.printB();
       b.printA();

        System.out.println();

       C2 c = new C2();
       c.printC();
       c.printA();
    }
}

//parent class
class A2
{
    void  printA()
    {
        System.out.println("I am Parent");
    }
}

//child class
class B2 extends A2
{
    void printB()
    {
        System.out.println("I am child b");
    }
}
class C2 extends  A2
{
    void printC()
    {
        System.out.println("I am child c");
    }
}