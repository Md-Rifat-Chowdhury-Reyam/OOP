package Interface.functional;

public class LamdaExpression {

    public static void main(String[] args) {

        // lambda expression to
        // define the calculate method
        LamdaAble l = (i) -> i+i;

        // parameter passed and return type must be
        // same as defined in the prototype
        int a = 4;
        int sum = l.calculte(a);
        System.out.println(sum);


    }
}

@FunctionalInterface
interface LamdaAble
{
    int calculte(int i); //by default abstract method
}