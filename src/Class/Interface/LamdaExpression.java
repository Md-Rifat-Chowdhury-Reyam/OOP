package Class.Interface;

import java.util.ArrayList;

public class LamdaExpression { //lamda expression is an interface
    //represents instance of functional interface
    //functional interface constist of only one abstract method

    public static void main(String[] args) {
        Lamdable lm = () -> System.out.println("This is zero parameter");
        lm.display();

        SingleParameterable sp = (x) -> System.out.println("I am signle parameter : " + x);
        sp.display(20);

        //this block is a simple lamda expression with ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(14);
        arr.add(30);
        arr.add(60);

        System.out.println("Elements of arrayList : ");
        arr.forEach(n -> System.out.println(n));

        //multiple lamda expression
        Multiplealable ml = (a,b) -> System.out.println("Values of a : " + a + " and b : " + b);
        ml.display(4,56);

    }

}

interface Lamdable
{
    abstract void display(); //zero parameter
}

@FunctionalInterface

interface SingleParameterable
{
    void display(int x ); //single parameter
}


@FunctionalInterface
interface Multiplealable
{
    void display(int a, int b);
}
