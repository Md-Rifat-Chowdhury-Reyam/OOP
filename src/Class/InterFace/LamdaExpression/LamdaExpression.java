package Class.InterFace.LamdaExpression;

public class LamdaExpression {

    public static void main(String[] args) {

        // Lambda expression with zero parameters
        Addiotionalable ad = () -> System.out.println("this is zero parameter lambda expression ");
        ad.Method1();

        //Lambda with a Single Parameter:
        Additionable2 ad2 = ((i) -> System.out.println("single parameter " + i));
        ad2.Method2(2);

        //Lambda with a multiple Parameter:
        Addiotionable3 ad3 = ((a, b) -> System.out.println("Multiple parameter : " + a + " , "  + b));
        ad3.Method3(2,3);
    }
}

interface Addiotionalable  // functional interface (An interface with
                            // single abstract method)
{
    abstract void Method1(); //zero parameter

}

interface Additionable2
{
    abstract void Method2(int i); //single parameter
}

interface  Addiotionable3
{
    abstract void Method3(int a , int b); //multiple parameter

}

