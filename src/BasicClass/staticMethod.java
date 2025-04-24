package BasicClass;

public class staticMethod {

    static int i;
    int a = 10; // instance variable;
    static int b = 20; //static variable;

    public void InstanceMethod()
    {
        System.out.println(a);
        System.out.println(b); //instance method can access static variables and method directly;
    }

    public static void StaticMethodTest()
    {
        // instance variable and instance methods can't access in static method directly;
        //System.out.println(a);
        System.out.println(b);
    }

    static
    {
      i = 10;
        System.out.println("static block called ");
    }

    public static void main(String[] args) {
        //instance methods can't access in static method directly;
        //InstanceMethod();
        staticMethod sm = new staticMethod();
        sm.InstanceMethod();

        StaticMethodTest();

        System.out.println(staticMethod.i);


    }
}
