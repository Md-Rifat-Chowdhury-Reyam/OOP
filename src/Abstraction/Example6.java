package Abstraction;


public class Example6 {
    public static void main(String[] args) {

        //Student1 st = new Student();

        Parents pt = new Parents();
        pt.m1();
        pt.m2();
        pt.m3();
    }
}

abstract class School
{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class Student1 extends School
{
    public void m1() {
        System.out.println("Inside m1");
    }

}

class Parents extends Student1
{
    public void m2() {
        System.out.println("Inside m2");
    }
    public void m3() {
        System.out.println("Inside m3");
    }

}