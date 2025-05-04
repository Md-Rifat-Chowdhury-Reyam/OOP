package Class.InterFace;

public class LamdaExpression {

    public static void main(String[] args) {

        FunctionalInterface fi = (int a) ->
        {
            System.out.println(2 * a);
        };

        fi.abstractFun(2);

    }
}

interface FunctionalInterface
{
    void abstractFun (int a);

    default void func ()
    {
        System.out.println("hello  functional interface");
    }
}

