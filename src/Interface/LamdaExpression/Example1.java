package Interface.LamdaExpression;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        Operationable add = ((a,b) -> a + b );
        System.out.println(add.calculate(3,4));

        Operationable mul  = ((a, b) -> a * b);
        System.out.println(mul.calculate(3,4));


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println("The array list : ");
        arr.forEach(n -> System.out.println(n)); //using forEach method

        System.out.println("The even array list");
        arr.forEach(n -> {
            if( n % 2 == 0)
            {
                System.out.println(n + " ");
            }
        });



    }
}

@FunctionalInterface
interface Operationable
{
    abstract int calculate(int a, int b);
}


