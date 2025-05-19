package Object;

public class UsingReflectionDynamicClassLoading {

    public UsingReflectionDynamicClassLoading()
    {
        //explicit default constructor
    }

    public static void main(String[] args) {

        try {

            Class <?> c = Class.forName("Object.UsingReflectionDynamicClassLoading");
            UsingReflectionDynamicClassLoading s2 = (UsingReflectionDynamicClassLoading) c.getDeclaredConstructor().newInstance();
            System.out.println("the object is : " + s2);
        }
        catch (ClassNotFoundException e) {

            System.err.println("Class not found!");

        } catch (NoSuchMethodException e) {

            System.err.println("No default constructor!");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }


}
