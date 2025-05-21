package Class.ConcreteClass;

public class Example1 {
    static int calculate(int i , int j)
    {
        return  i + j ;
    }

    public static void main(String[] args) {
        int s = calculate(4,5); //no need to create an object
        System.out.println("sum : " + s);


        B b = new B();
        int p = b.mul(4,5);
        System.out.println(p);


    }
}

interface interFaceClass
{
    int mul(int i , int j);
}

class B implements interFaceClass
{
     public  int mul(int i , int j)
    {
       return  i * j;
    }

}
