package Class.InnerOrNested;

public class StaticNestedClass { //outer or main class

    void outerMethod()

    {
        System.out.println("I am from outer class");
    }

    static class InnerClass //static nested class
    {
        public InnerClass() //constructor
        {
            System.out.println("i am inner static class constructor");
        }

        static void innerMethod() // static method
        {
            System.out.println("I am from inner static class");
        }

    }

    public static void main(String[] args) {
        StaticNestedClass.InnerClass.innerMethod();
        //or

        StaticNestedClass.InnerClass inerObject = new StaticNestedClass.InnerClass();

        inerObject.innerMethod();
    }

}
