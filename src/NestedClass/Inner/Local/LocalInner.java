package NestedClass.Inner.Local;

public class LocalInner {

    public void outerMethod()
    {
        System.out.println("I am Outer method");

       int x = 200;
       final String name = "Rifat";

        class inner
        {
            public void innerMethod()
            {

                System.out.println("I am inner method " + x + " " +name);
            }

        }
        inner in = new inner();
        in.innerMethod();
    }

    public static void main(String[] args) {
        LocalInner lc = new LocalInner();

        lc.outerMethod();
    }
}
