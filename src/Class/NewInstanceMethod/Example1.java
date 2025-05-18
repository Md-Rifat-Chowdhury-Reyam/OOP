package Class.NewInstanceMethod;

//The newInstance() method of a Constructor class is used to create and initialize a new instance of this constructor,
// with the initialization parameters passed as parameter to this method.

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Constructor;

public class Example1 {


    public static void main(String[] args) {
        try {

            //array of constructor;
            Constructor[] c = Test.class.getDeclaredConstructors();//getDeclaredConstructor() → Gets the default (no-args) constructor.

            //Test class's object and apply newInstance()
            Test obj = (Test)c[0].newInstance();//newInstance() → Creates a new object of the class.
            System.out.println(obj.var1);
        }
        catch ( InstantiationException |
               IllegalAccessException |
                IllegalArgumentException |
                ExceptionInInitializerError e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Test
{
    String var1;
    public Test()
    {
        System.out.println("I am explicit default constructor");
        var1  = "newInstance() method";

    }
}
