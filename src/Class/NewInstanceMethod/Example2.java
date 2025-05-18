package Class.NewInstanceMethod;

import java.lang.reflect.Constructor;

public class Example2 {

    String name = "Md.Rifat";

    public static void main(String[] args) {
        try {
            //match the class name
            // Class.forName("Class.Intro.InstanceMethod") → Loads the class dynamically.
            Class<?> c = Class.forName("Class.NewInstanceMethod.Example2");//Location

            // Get the default constructor (throws NoSuchMethodException if none exists)
            Constructor c1 = c.getDeclaredConstructor();
            c1.setAccessible(true);//If the constructor is not public, this allows us to use it.

            // Create a new instance
            Example2 ex = (Example2) c1.newInstance();
            System.out.println(ex.name);


            Constructor[] conArr = Test2.class.getConstructors();

            if (conArr.length > 0)
            {
                conArr[0].setAccessible(true);
                Test2 t2 = (Test2) conArr[0].newInstance();

                System.out.println("Test class display : ");
            }
            else
            {
                System.err.println("No constructors found for Test class!");
            }

        }
        catch (ClassNotFoundException e) {
            System.err.println("Class not found! Check the package/class name.");
        }
        catch (NoSuchMethodException e) {
            System.err.println("No default constructor found!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Test2
{
//    public Test2()
//    {
//        System.out.println("I am explicit default constructor");
//    }
}
