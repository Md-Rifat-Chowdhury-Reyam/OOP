package Class.BasicClass;

import java.lang.reflect.*;

public class CreateObjectMethod
{
    String search = "Create";
    public static void main(String[] args)
    {
        try {
            Class<?> c = Class.forName("Class.BasicClass.CreateObjectMethod");
            CreateObjectMethod cl =  (CreateObjectMethod) c.getDeclaredConstructor().newInstance();

            System.out.println(cl.search);
        }

        catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
               NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
