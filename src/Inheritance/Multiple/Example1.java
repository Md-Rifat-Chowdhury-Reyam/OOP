package Inheritance.Multiple;

//Note: Java doesn't support Multiple Inheritance


public class Example1 {
    public static void main(String[] args) {

        DevOp d =  new DevOp();
        d.writeCode();
        d.testCode();
    }
}

interface Coder
{
    void writeCode();
}

interface Tester
{
    void testCode();

    default void info() //default method
    {
        System.out.println("interface allow default");
    }
}

class DevOp implements Coder, Tester
{
    @Override
    public void writeCode() {
        System.out.println("DevOps write code");
    }

    @Override
    public void testCode() {
        System.out.println("test code");
        Tester.super.info();
    }
}