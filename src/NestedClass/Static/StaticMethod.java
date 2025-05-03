package NestedClass.Static;

import org.w3c.dom.ls.LSOutput;

public class StaticMethod {

    public static void disPlay()
    {
        System.out.println("I am from outer class");
    }

    static class InnerC
    {
        static void innerMethod()
        {
            System.out.println("Below call from inner class method");
            disPlay();
        }

    }

    public static void main(String[] args) {

        StaticMethod.InnerC.innerMethod();
    }

}
