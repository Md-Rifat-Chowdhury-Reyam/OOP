package NestedClass.Inner.Annonymous;

public class example1 {


    int a =  10;
    int b = 20;

    void sum()
    {
        example1 e = new example1();

        int sum = e.a + e.b;
        System.out.println("sum from super class " + sum);
    }

}

class annoN
{
   static example1 ex = new example1()
    {
       void sum()//In anonymous class sum() method is overridden.
        {
            super.sum();
            System.out.println("sum from annonymous " );
        }

    };

    public static void main(String[] args) {
        ex.sum();
    }
}
