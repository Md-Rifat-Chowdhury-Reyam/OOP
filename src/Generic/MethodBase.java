package Generic;

public class MethodBase {

    static  <T> void genericMethod(T var)
    {
        System.out.println(var.getClass().getName() + " element = " + var);
    }

    public static void main(String[] args) {

        genericMethod(10);
        genericMethod("Rifat");
    }

}
