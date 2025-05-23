package Inheritance;

public class Multilevel {
    public static void main(String[] args) {

        C1 c = new C1();
        c.printC();
        c.printB();
        c.printA();
    }
}

class A1
{
    void printA()
    {
        System.out.println("I am parent class");
    }
}

//intermediatory class
class B1 extends A1
{
    void printB()
    {
        System.out.println("I am intermediatory class");
    }
}
//child class
class C1 extends B1
{
    void printC()
    {
        System.out.println("I am child");
    }
}