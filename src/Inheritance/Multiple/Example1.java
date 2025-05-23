package Inheritance.Multiple;

public class Example1 {
    public static void main(String[] args) {

        DevOp d =  new DevOp();
        d.writeCode();
        d.writeCode();
    }
}

interface Coder
{
    void writeCode();
}

interface Tester
{
    void testCode();
}

class DevOp implements Coder, Tester
{
    @Override
    public void writeCode() {
        System.out.println("write code");
    }

    @Override
    public void testCode() {
        System.out.println("test code");
    }
}